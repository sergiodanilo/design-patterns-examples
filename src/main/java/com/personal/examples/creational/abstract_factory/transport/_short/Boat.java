package com.personal.examples.creational.abstract_factory.transport._short;

public class Boat implements ShortVehicle {

    private int cargo = 500;

    @Override
    public String cargoWeight() {
        return cargo + " Kilos";
    }

}
