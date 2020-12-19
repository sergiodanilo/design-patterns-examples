package com.personal.examples.creational.factory_method.transport;

public class Ship implements Transport {

    @Override
    public String deliver() {
        return "delivery by sea in a container.";
    }

}
