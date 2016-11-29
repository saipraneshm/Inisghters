package com.android.humanactivityrecognition.insighters.model;

import java.util.List;

/**
 * Created by sai pranesh on 29-Nov-16.
 */

public class SensorInformation {
    private List<String> mCoordinates;
    private String mCreationTime;
    private String mEndTime;

    public SensorInformation(){}

    public SensorInformation(List<String> coordinates, String creationTime){
        mCoordinates = coordinates;
        mCreationTime = creationTime;
    }

    public SensorInformation(List<String> coordinates, String creationTime, String endTime){
        mCoordinates = coordinates;
        mCreationTime = creationTime;
        mEndTime = endTime;
    }

    public List<String> getCoordinates() {
        return mCoordinates;
    }

    public void setCoordinates(List<String> coordinates) {
        mCoordinates = coordinates;
    }

    public String getCreationTime() {
        return mCreationTime;
    }

    public void setCreationTime(String creationTime) {
        mCreationTime = creationTime;
    }

    public String getEndTime() {
        return mEndTime;
    }

    public void setEndTime(String endTime) {
        mEndTime = endTime;
    }
}
