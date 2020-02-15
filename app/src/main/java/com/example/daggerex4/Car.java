package com.example.daggerex4;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void enableRemote(Remote remote){

    }

    void drive(){
        Log.d(TAG, "Driving ... !!");
    }


}
