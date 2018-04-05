package com.example.android.quakereport;

/**
 * Created by priyankanaik on 20/01/2018.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mURL;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String URL) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mURL = URL;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getURL() {
        return mURL;
    }
}
