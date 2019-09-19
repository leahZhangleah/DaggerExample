package com.example.daggerexample;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {HouseComponent.class})
public class AppModule {
    @Provides
    Builder provideBuilder(){
        return new Builder();
    }
}
