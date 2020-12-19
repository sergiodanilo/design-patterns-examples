package com.personal.examples.creational.factory_method.transport;

import com.personal.examples.creational.factory_method.transport.Transport;

public class Truck implements Transport {

    @Override
    public String deliver() {
        return "delivery by land in a box.";
    }

}
