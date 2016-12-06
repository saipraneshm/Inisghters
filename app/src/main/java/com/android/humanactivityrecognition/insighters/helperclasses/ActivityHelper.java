package com.android.humanactivityrecognition.insighters.helperclasses;

import android.app.Activity;
import android.content.pm.ActivityInfo;

/**
 * Created by sai pranesh on 29-Nov-16.
 */
//Other classes will use this static method to set the orientation to portrait
public class ActivityHelper {

    public static void initialize(Activity activity){
        //setting the orientation to portrait programmatically
        activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
}
