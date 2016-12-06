package com.android.humanactivityrecognition.insighters.model;

import java.util.Map;

public class SensorInformation {
    private Map<String, Double> mCoordinates;
    private Long mCreation_time;
    private String mEndTime;
    private String mState;
    private Map<String, Double> mLocation;

    public SensorInformation(){}

    public SensorInformation(Map<String, Double> coordinates, Long creationTime){
        mCoordinates = coordinates;
        mCreation_time = creationTime;
    }

    public SensorInformation(Map<String, Double> coordinates, Long creationTime, String endTime){
        mCoordinates = coordinates;
        mCreation_time = creationTime;
        mEndTime = endTime;
    }

    public Map<String, Double> getCoordinates() {
        return mCoordinates;
    }

    public void setCoordinates(Map<String, Double> coordinates) {
        mCoordinates = coordinates;
    }

    public Long getCreation_time() {
        return mCreation_time;
    }

    public void setCreation_time(Long creation_time) {
        mCreation_time = creation_time;
    }

    public String getEndTime() {
        return mEndTime;
    }

    public void setEndTime(String endTime) {
        mEndTime = endTime;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public Map<String, Double> getLocation() {
        return mLocation;
    }

    public void setLocation(Map<String, Double> location) {
        mLocation = location;
    }
}
