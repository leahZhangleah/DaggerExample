package com.example.daggerexample;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class ExteriorDesigner implements Designer {
    private static final String TAG = "ExteriorDesigner";

    String name,country;
    @Inject
    public ExteriorDesigner(@Named("name") String name, @Named("country") String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public void design() {
        Log.d(TAG, "Exterior Designer "+name+ " from " +country+" designed");
    }
}
