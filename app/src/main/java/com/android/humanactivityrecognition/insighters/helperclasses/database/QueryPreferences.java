package com.android.humanactivityrecognition.insighters.helperclasses.database;

import android.content.Context;
import android.content.SharedPreferences;

import com.android.humanactivityrecognition.insighters.application.InsightersApplication;

/**
 * Created by sai pranesh on 06-Dec-16.
 */

public class QueryPreferences {

    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor mEditor;

    private static final String FILE_NAME = "InsightersSharedPreferences";
    Context mContext = InsightersApplication.getAppContext();

    public QueryPreferences(){
        mSharedPreferences = InsightersApplication.getInstance().getSharedPreferences(FILE_NAME,Context.MODE_PRIVATE);
    }

}
