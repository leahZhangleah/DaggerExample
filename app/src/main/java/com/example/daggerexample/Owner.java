package com.example.daggerexample;

import android.util.Log;

import javax.inject.Inject;

public class Owner {
    private static final String TAG = "Owner";

    @Inject
    public Owner() {
    }

    public void setListener(House house){
        Log.d(TAG, "I own the house");
    }
}
