package com.personal.examples.creational.abstract_factory.factories;

import com.personal.examples.creational.abstract_factory.transport._long.LongVehicle;
import com.personal.examples.creational.abstract_factory.transport._long.Truck;
import com.personal.examples.creational.abstract_factory.transport._short.Pickup;
import com.personal.examples.creational.abstract_factory.transport._short.ShortVehicle;

public class RoadVehicleFactory extends VehicleFactory {

    @Override
    public ShortVehicle getShortVehicle() {
        return new Pickup();
    }

    @Override
    public LongVehicle getLongVehicle() {
        return new Truck();
    }

}

