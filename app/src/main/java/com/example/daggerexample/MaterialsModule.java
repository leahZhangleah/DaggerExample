package com.example.daggerexample;

import dagger.Module;
import dagger.Provides;

@Module
public class MaterialsModule {

    @Provides
    static Concrete provideConcrete(){
        return new Concrete();
    }

    @Provides
    static Wood provideWood(){
        Wood wood = new Wood();
        wood.cut();
        return wood;
    }

    @Provides
    static Materials provideMaterials(Concrete concrete,Wood wood){
        return new Materials(concrete,wood);
    }
}
