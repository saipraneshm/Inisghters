package com.android.humanactivityrecognition.insighters.activity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.humanactivityrecognition.insighters.R;
import com.android.humanactivityrecognition.insighters.helperclasses.HumanActivityClassifier;
import com.android.humanactivityrecognition.insighters.helperclasses.WekaWrapper;
import com.android.humanactivityrecognition.insighters.model.SensorInformation;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
/*import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;*/

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class SensorManagementActivity extends AppCompatActivity implements View.OnClickListener, SensorEventListener,
        LocationListener, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private SensorManager mSensorManager;
    private Sensor mGyroscopeSensor;
    private static final String TAG = "SensorManagementMA";
    private Button mStartSensor, mStopSensor, mNavigation;
    private TextView tvClassify;
    private int mCount = 0;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mDatabaseReference;
    private Double mMeanX = 0.0, mMeanY = 0.0, mMeanZ = 0.0;
    private Integer currentElementNumber = 0;
    private String provider;
    private LocationManager mLocationManager;
    private GoogleApiClient mGoogleApiClient;
    private Location mLastLocation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_management);
        mStartSensor = (Button) findViewById(R.id.startSensor);
        mStopSensor = (Button) findViewById(R.id.stopSensor);
        mNavigation = (Button) findViewById(R.id.navigationDrawerBtn);
        tvClassify = (TextView) findViewById(R.id.tvClassify);

        mStartSensor.setOnClickListener(this);
        mStopSensor.setOnClickListener(this);
        mNavigation.setOnClickListener(this);

        if (mGoogleApiClient == null) {
            mGoogleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addOnConnectionFailedListener(this)
                    .addApi(LocationServices.API)
                    .build();
        }


        mLocationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        provider = mLocationManager.getBestProvider(new Criteria(), false);

        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED
                && ActivityCompat
                .checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }

        Location location = mLocationManager.getLastKnownLocation(provider);

        if (location != null) {
            Log.d(TAG, "location achieved");
        } else {
            Log.d(TAG, "location not achieved");
        }


        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> deviceSensors = mSensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor deviceSensor : deviceSensors) {
            Log.d("DeviceSensors", deviceSensor.getName());
        }

        mGyroscopeSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mDatabaseReference = mFirebaseDatabase.getReference();
    }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((sensorEvent.timestamp / 1000000));
        Log.d(TAG, sensorEvent.values[0] + " " +
                sensorEvent.values[1] + " " +
                sensorEvent.values[2]);
//        Log.d(TAG + "this", "result 2:" + HumanActivityClassifier.classifyInstance
//                (sensorEvent.values[0],sensorEvent.values[1],sensorEvent.values[2]));

        Calendar c = Calendar.getInstance();
        long timeInMillis = (new Date()).getTime()
                + (sensorEvent.timestamp - System.nanoTime()) / 1000000L;
        c.setTimeInMillis(timeInMillis);
        Date d = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.US);

        Double x = new BigDecimal(sensorEvent.values[0] + "").doubleValue();
        Double y = Double.parseDouble(Float.toString(sensorEvent.values[1]));
        Double z = Double.parseDouble(Float.toString(sensorEvent.values[2]));

        Map<String, Double> coordinates = new HashMap<>();
        coordinates.put("x", x);
        coordinates.put("y", y);
        coordinates.put("z", z);

        if (mCount <= 20) {
            mMeanX += sensorEvent.values[0];
            mMeanY += sensorEvent.values[1];
            mMeanZ += sensorEvent.values[2];
        }
        if (mCount == 0 || mCount == 20) {
            Log.d(TAG + " Time", sdf.format(d) + ":" + mCount);
            if (mCount == 20) {
                mCount = -1;
                mMeanX = mMeanX / 20;
                mMeanY = mMeanY / 20;
                mMeanZ = mMeanZ / 20;

                Map<String, Double> meanValuesList = new HashMap<>();
                meanValuesList.put("x", mMeanX);
                meanValuesList.put("y", mMeanY);
                meanValuesList.put("z", mMeanZ);

                HumanActivityClassifier h = new HumanActivityClassifier();
                String result = h.initialize(mMeanX, mMeanY, mMeanZ, new WekaWrapper());
                tvClassify.setText(result);

                SensorInformation sensorInformation = new SensorInformation(meanValuesList, timeInMillis);
                sensorInformation.setState(result);
                if (getLocation() != null) {
                    sensorInformation.setLocation(getLocation());
                }

                //mDatabaseReference.child("test").setValue("ehy");

                DatabaseReference classifiedReference = mFirebaseDatabase.getReference("/users/IQHVFvcIAxTQlsTcMS2Yogl04zd2/classifiedData");
                classifiedReference.child(currentElementNumber.toString()).setValue(sensorInformation);

                mFirebaseDatabase.getReference("/users/IQHVFvcIAxTQlsTcMS2Yogl04zd2").addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(DataSnapshot dataSnapshot, String s) {

                        if (dataSnapshot != null && dataSnapshot.hasChildren()) {
                            currentElementNumber += 1;
                            Log.d("child", dataSnapshot.getChildrenCount() + ": children count");
                        }
                    }

                    @Override
                    public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onChildRemoved(DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

                mMeanX = 0.0;
                mMeanY = 0.0;
                mMeanZ = 0.0;
            }
        }
        mCount++;
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }


    @Override
    protected void onResume() {
        super.onResume();

        if (ActivityCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat
                        .checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                        != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mLocationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 500, 1, this);
        mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 500, 1, this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
       if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mLocationManager.removeUpdates(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.stopSensor:
                mSensorManager.registerListener(this, mGyroscopeSensor, SensorManager.SENSOR_DELAY_UI);
                //-0.20111294    -0.24899697    9.481039 sit
                //6.173449    -4.7441106    5.2277393 walk
                //-5.958191    0.6880646    8.135345 stand
                //-0.25318682    4.2598834    -0.64583594    fall
                //-1.7717092    0.31603462    9.394848    sit
                //   Log.d(TAG + "this", "result 2:" + HumanActivityClassifier.classifyInstance(-1.7717092f,0.31603462f,9.394848f));

                // WekaWrapper.runApp(test);
                break;
            case R.id.startSensor:
                mSensorManager.unregisterListener(this);
                break;
            case R.id.navigationDrawerBtn:

              /*  DatabaseReference mExistingUserRef= mFirebaseDatabase.getReference("/users/IQHVFvcIAxTQlsTcMS2Yogl04zd2");
                DatabaseReference mRef = mFirebaseDatabase.getReference("/user/classifiedData");
                mExistingUserRef.child("classifiedData").setValue(mRef);*/
                
                /*Intent i = new Intent(MainActivity.this,NavigationActivity.class);
                startActivity(i);*/
                break;
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        currentElementNumber = 0;
    }

    @Override
    public void onLocationChanged(Location location) {

        Double lat = location.getLatitude();
        Double lng = location.getLongitude();

        Log.i("Location info: Lat", lat.toString());
        Log.i("Location info: Lng", lng.toString());

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }

    private Map<String, Double> getLocation() {

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
        }
        Location location = mLocationManager.getLastKnownLocation(provider);
        if (location != null) {
            Double lat = location.getLatitude();
            Double lng = location.getLongitude();
            Map<String, Double> storeLocation = new HashMap<>();
            storeLocation.put("lat", lat);
            storeLocation.put("long", lng);
            return storeLocation;
        } else {
            return null;
        }
    }

    @Override
    protected void onStart() {
        mGoogleApiClient.connect();
        super.onStart();
    }

    @Override
    protected void onStop() {
        mGoogleApiClient.disconnect();
        super.onStop();
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        if (mLastLocation != null) {
            /*mLatitudeText.setText(String.valueOf(mLastLocation.getLatitude()));
            mLongitudeText.setText(String.valueOf(mLastLocation.getLongitude()));*/
            Log.d(TAG,"Lat" + mLastLocation.getLatitude());
            Log.d(TAG,"Lng" + mLastLocation.getLongitude());
        }else{
            Log.d(TAG,"Location not found" );
        }
    }

    @Override
    public void onConnectionSuspended(int i) {
        Log.i(TAG, "Connection suspended");
        mGoogleApiClient.connect();
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Log.i(TAG, "Connection failed: ConnectionResult.getErrorCode() = " + connectionResult.getErrorCode());
    }
}
