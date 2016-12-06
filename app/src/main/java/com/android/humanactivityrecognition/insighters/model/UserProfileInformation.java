package com.android.humanactivityrecognition.insighters.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by sai pranesh on 05-Dec-16.
 */

public class UserProfileInformation extends RealmObject {

    private String firstName;
    private String lastName;
    private Integer phone;
    private String password;

    @PrimaryKey
    private String email;

    private Integer currentCoordinateKey;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getCurrentCoordinateKey() {
        return currentCoordinateKey;
    }

    public void setCurrentCoordinateKey(Integer currentCoordinateKey) {
        this.currentCoordinateKey = currentCoordinateKey;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
