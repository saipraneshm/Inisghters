package com.android.humanactivityrecognition.insighters.helperclasses.database;

import com.android.humanactivityrecognition.insighters.model.UserProfileInformation;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmModel;
import io.realm.RealmQuery;

/**
 * Created by sai pranesh on 06-Dec-16.
 */

public class DbManager {

    private Realm realm;
    private static DbManager sDbManager;

    public static DbManager getInstance(Realm realm) {
        if (sDbManager == null) {
            sDbManager = new DbManager();
        }
        sDbManager.setRealm(realm);

        return sDbManager;
    }

    public DbManager() {

    }

    public void setRealm(Realm realm) {
        this.realm = realm;
    }

    public void saveProfileInformation(UserProfileInformation userProfileInformation){
        realm.beginTransaction();
        realm.copyToRealmOrUpdate(userProfileInformation);
        realm.commitTransaction();
    }

    public UserProfileInformation getUserProfileInformation(String emailId){
        RealmQuery<UserProfileInformation> query = realm.where(UserProfileInformation.class).equalTo("email",emailId);
        return query.findFirst();
    }
}
