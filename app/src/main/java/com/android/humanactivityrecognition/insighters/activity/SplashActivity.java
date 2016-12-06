package com.android.humanactivityrecognition.insighters.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(LoginActivity.newIntent(this));
        //startActivity(new Intent(this, SensorManagementActivity.class));
        finish();
    }
}
