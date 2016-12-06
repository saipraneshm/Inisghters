package com.android.humanactivityrecognition.insighters.model;

/**
 * Created by sai pranesh on 05-Dec-16.
 */

public class EmergencyContactInformation {

    private String firstName;
    private String lastName;
    private Integer phone;
    private String email;
    private Boolean isEmailNotificationOn;
    private Boolean isPhoneNotificationOn;

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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailNotificationOn() {
        return isEmailNotificationOn;
    }

    public void setEmailNotificationOn(Boolean emailNotificationOn) {
        isEmailNotificationOn = emailNotificationOn;
    }

    public Boolean getPhoneNotificationOn() {
        return isPhoneNotificationOn;
    }

    public void setPhoneNotificationOn(Boolean phoneNotificationOn) {
        isPhoneNotificationOn = phoneNotificationOn;
    }
}
