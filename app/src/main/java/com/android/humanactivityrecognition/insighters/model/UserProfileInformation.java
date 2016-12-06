package com.android.humanactivityrecognition.insighters.model;

import io.realm.RealmObject;

/**
 * Created by sai pranesh on 05-Dec-16.
 */

public class UserProfileInformation extends RealmObject {

    private String firstName;
    private String lastName;
    private Integer phone;
    private String email;

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
}
