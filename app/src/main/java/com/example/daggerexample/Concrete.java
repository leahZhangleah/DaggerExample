package com.example.daggerexample;

import android.util.Log;

@PerActivity
public class Concrete {
    private static final String TAG = "Concrete";
    //we don't own this class so we can't annotate it with @Inject

    public Concrete() {
        //Log.d(TAG, this+"");
    }
}
