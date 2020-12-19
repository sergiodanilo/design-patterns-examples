package com.personal.examples.creational.factory_method.factories;

import com.personal.examples.creational.factory_method.transport.Transport;
import com.personal.examples.creational.factory_method.transport.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }

}
