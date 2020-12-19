package com.personal.examples.creational.abstract_factory.transport._long;

public class Truck implements LongVehicle {

    private int cargo = 2;

    @Override
    public String cargoWeight() {
        return cargo + " Toneladas";
    }

}
