package com.android.humanactivityrecognition.insighters.helperclasses.database;

import io.realm.DynamicRealm;
import io.realm.RealmMigration;

/**
 * Created by sai pranesh on 06-Dec-16.
 */

public class InsightersRealmMigration implements RealmMigration {
    @Override
    public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {

        int oVersion = (int) oldVersion;
        switch (oVersion) {
            case 1:
        }
    }
}
