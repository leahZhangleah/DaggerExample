package com.example.daggerexample;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module()
public abstract class InteriorDesignerModule {
    //we use binds annotation when we just want to return the parameter
    @Binds
    abstract Designer bindInteriorDesigner(InteriorDesigner interiorDesigner);


    //same as above
   //if we use this method instead, we need to either add static in front of the method or remove abstract keyword from class
   //or we can define another module with this provide method and include that module into this module
   // the benefit of above method is to reduce boilerplate code,
  /*  @Provides
    static Designer provideInteriorDesigner(String name){
        return new InteriorDesigner(name);
    }*/
}
