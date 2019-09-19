package com.example.daggerexample;

import android.os.Build;
import android.util.Log;

import javax.inject.Inject;

@PerActivity
public class House {
    private static final String TAG = "House";
    private Builder builder;
    private Materials materials;
    private Designer designer;

    @Inject
    public House(Builder builder, Materials materials, Designer designer) {
        this.builder = builder;
        this.materials = materials;
        this.designer = designer;
    }

    @Inject
    public void set(Owner owner){
        owner.setListener(this);
    }

    public void build(){
        designer.design();
        Log.d(TAG, builder + " is building "+this);
    }
}
