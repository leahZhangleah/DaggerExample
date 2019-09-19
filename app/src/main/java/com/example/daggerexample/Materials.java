package com.example.daggerexample;

import android.util.Log;

import javax.inject.Inject;

public class Materials {
    //we don't own this class so we can't annotate it with @Inject
    private static final String TAG = "Materials";
    private Concrete concrete;
    private Wood wood;

    public Materials(Concrete concrete, Wood wood) {
        this.concrete = concrete;
        this.wood = wood;
        //Log.d(TAG, ""+this);
    }
}
