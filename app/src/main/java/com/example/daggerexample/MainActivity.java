package com.example.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Singleton;

public class MainActivity extends AppCompatActivity {
    @Inject
    @PerActivity House house1,house2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //When component doesn't need to instantiate any modules or pass parameters, we can directly use create()
        //otherwise, we can override builder in component, use builder() instead to instantiate component
        AppComponent appComponent = ((DaggerApp) getApplication()).getAppComponent();
        //HouseComponent houseComponent = appComponent.getHouseComponent();
        HouseComponent houseComponent = appComponent.getHouseComponentFactory().newHouseComponent("Sofia", "Sweden");
        houseComponent.inject(this);
        house1.build();
        house2.build();
    }
}
