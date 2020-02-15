package com.example.daggerex4;

import javax.inject.Inject;

public class Wheel {

    //Assuming this as a 3rd party library

    private Rims rims;
    private Tires tires;

    public Wheel(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
