package com.android.humanactivityrecognition.insighters.activity.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.humanactivityrecognition.insighters.R;
import com.android.humanactivityrecognition.insighters.application.InsightersApplication;
import com.android.humanactivityrecognition.insighters.helperclasses.database.DbManager;

import io.realm.Realm;
import io.realm.exceptions.RealmMigrationNeededException;

/**
 * Created by sai pranesh on 06-Dec-16.
 */

public abstract class ActivityBase extends AppCompatActivity {

    private Realm realm;
    private DbManager mDbManager;
    private ProgressDialog mProgressDialog;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        try {
            realm = Realm.getInstance(InsightersApplication.getRealmConfiguration());

        }
        catch (RealmMigrationNeededException e){
            try {
                Realm.deleteRealm(InsightersApplication.getRealmConfiguration());
                realm = Realm.getInstance(InsightersApplication.getRealmConfiguration());
            }
            catch (Exception ex){
                Log.e("RealmException", ex.getMessage());
            }
        }

        mDbManager = DbManager.getInstance(realm);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(realm != null){
            realm.close();
        }
    }

    public Realm getRealm(){
        return realm;
    }

    public DbManager getDbManager(){
        return mDbManager;
    }

    public void showProgressDialog(){
        if(mProgressDialog == null){
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setMessage(getString(R.string.loading));
            mProgressDialog.setIndeterminate(true);
        }
        mProgressDialog.show();
    }

    public void hideProgressDialog(){
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        hideProgressDialog();
    }

}
