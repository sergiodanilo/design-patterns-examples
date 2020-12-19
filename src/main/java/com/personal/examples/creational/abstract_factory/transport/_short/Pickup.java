package com.personal.examples.creational.abstract_factory.transport._short;

public class Pickup implements ShortVehicle {

    private int cargo = 300;

    @Override
    public String cargoWeight() {
        return cargo + " Kilos";
    }

}
