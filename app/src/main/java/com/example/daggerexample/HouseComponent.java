package com.example.daggerexample;

import android.os.Build;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {MaterialsModule.class,ExteriorDesignerModule.class})
public interface HouseComponent {

    //House getHouse();

    void inject(MainActivity activity);

    @Subcomponent.Factory
    interface Factory{

        HouseComponent newHouseComponent(@BindsInstance @Named("name") String name, @BindsInstance @Named("country") String country);
        /*@BindsInstance
        Builder name(@Named("name")String name);
        @BindsInstance
        Builder country(@Named("country") String country);
        HouseComponent build();*/
    }

}
