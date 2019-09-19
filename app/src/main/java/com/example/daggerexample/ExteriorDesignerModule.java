package com.example.daggerexample;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ExteriorDesignerModule {

    @Binds
    abstract Designer bindExteriorDesigner(ExteriorDesigner exteriorDesigner);

  /*  @Provides
    Designer provideExteriorDesigner(){
        return new ExteriorDesigner(name,country);
    }

    String name,country;

    public ExteriorDesignerModule(String name, String country) {
        this.name = name;
        this.country = country;
    }*/
}
