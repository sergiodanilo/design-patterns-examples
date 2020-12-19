package com.personal.examples.creational.abstract_factory.factories;

import com.personal.examples.creational.abstract_factory.transport._long.LongVehicle;
import com.personal.examples.creational.abstract_factory.transport._long.Ship;
import com.personal.examples.creational.abstract_factory.transport._short.Boat;
import com.personal.examples.creational.abstract_factory.transport._short.ShortVehicle;

public class SeaVehicleFactory extends VehicleFactory {

    @Override
    public ShortVehicle getShortVehicle() {
        return new Boat();
    }

    @Override
    public LongVehicle getLongVehicle() {
        return new Ship();
    }

}
