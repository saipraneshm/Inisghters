package com.android.humanactivityrecognition.insighters.application;

import android.app.Application;
import android.content.Context;

import com.android.humanactivityrecognition.insighters.helperclasses.database.InsightersRealmMigration;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmMigration;

/**
 * Created by sai pranesh on 06-Dec-16.
 */

public class InsightersApplication extends Application {

    private static InsightersApplication sInstance;
    private static Context appContext;
    private static RealmConfiguration sRealmConfiguration;
    private String REALM_NAME = "insighters.realm";
    private Integer REALM_VER = 1;


    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        sRealmConfiguration = new RealmConfiguration.Builder()
                .name(REALM_NAME)
                .schemaVersion(REALM_VER)
                .migration(new InsightersRealmMigration())
                .build();
        Realm.setDefaultConfiguration(sRealmConfiguration);
        sInstance = this;
        appContext = getApplicationContext();
    }

    public static InsightersApplication getInstance(){
        return sInstance;
    }

    public static Context getAppContext(){
        return appContext;
    }

    public static RealmConfiguration getRealmConfiguration(){
        return sRealmConfiguration;
    }
}
