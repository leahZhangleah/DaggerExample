package com.example.daggerexample;

import javax.inject.Singleton;

import dagger.Component;
    @Singleton
    @Component(modules = AppModule.class)
    public interface AppComponent {

        //Builder getBuilder();

        //void inject(Application this);

        HouseComponent.Factory getHouseComponentFactory();

    }
