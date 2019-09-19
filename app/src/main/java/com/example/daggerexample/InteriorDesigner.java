package com.example.daggerexample;

import android.util.Log;

import javax.inject.Inject;

public class InteriorDesigner implements Designer{
    private static final String TAG = "InteriorDesigner";
    @Inject
    public InteriorDesigner() {

    }


    @Override
    public void design() {
        Log.d(TAG, "Interior Designer designed");
    }
}
