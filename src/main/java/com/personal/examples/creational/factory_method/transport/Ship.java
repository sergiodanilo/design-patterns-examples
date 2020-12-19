package com.personal.examples.creational.factory_method.transport;

public class Ship implements Transport {

    @Override
    public String deliver() {
        return "delivery by _long in a container.";
    }

}
