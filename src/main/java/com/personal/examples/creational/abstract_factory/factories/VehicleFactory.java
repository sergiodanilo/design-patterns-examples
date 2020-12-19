package com.personal.examples.creational.abstract_factory.factories;

import com.personal.examples.creational.abstract_factory.transport._long.LongVehicle;
import com.personal.examples.creational.abstract_factory.transport._short.ShortVehicle;

public abstract class VehicleFactory {

    public abstract ShortVehicle getShortVehicle();
    public abstract LongVehicle getLongVehicle();

}
