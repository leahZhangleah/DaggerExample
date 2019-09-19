package com.example.daggerexample;

import android.util.Log;

public class Wood {
    //we don't own this class so we can't annotate it with @Inject
    private static final String TAG = "Wood";

    public Wood() {
        //Log.d(TAG, ""+this);
    }

    public void cut(){
        Log.d(TAG, "Wood cut");
    }
}
