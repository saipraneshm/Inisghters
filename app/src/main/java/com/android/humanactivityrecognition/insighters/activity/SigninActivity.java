package com.android.humanactivityrecognition.insighters.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.humanactivityrecognition.insighters.R;

public class SigninActivity extends AppCompatActivity {


    public static Intent newIntent(Context context){
        Intent i = new Intent(context, SigninActivity.class);
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
}
