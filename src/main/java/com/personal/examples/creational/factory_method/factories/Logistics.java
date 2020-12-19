package com.personal.examples.creational.factory_method.factories;

import com.personal.examples.creational.factory_method.transport.Transport;

public abstract class Logistics {

    public String planDelivery() {
        Transport transport = createTransport();
        return "This vehicle " + transport.deliver();
    }

    public abstract Transport createTransport();

}
