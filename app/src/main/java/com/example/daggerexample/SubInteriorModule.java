package com.example.daggerexample;

import dagger.Module;
import dagger.Provides;

@Module
public class SubInteriorModule {

    @Provides
    String provideName(){
        return "Idun";
    }
}
