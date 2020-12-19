package com.personal.examples.creational.factory_method.factories;

import com.personal.examples.creational.factory_method.transport.Ship;
import com.personal.examples.creational.factory_method.transport.Transport;

public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }

}
