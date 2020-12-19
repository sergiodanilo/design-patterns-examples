package com.personal.examples.creational.abstract_factory.transport._long;

public class Ship implements LongVehicle {

    private int cargo = 30;

    @Override
    public String cargoWeight() {
        return cargo + " Toneladas";
    }

}
