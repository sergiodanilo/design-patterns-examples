package com.personal.examples.creational.abstract_factory;

import com.personal.examples.creational.abstract_factory.factories.RoadVehicleFactory;
import com.personal.examples.creational.abstract_factory.factories.SeaVehicleFactory;
import com.personal.examples.creational.abstract_factory.factories.VehicleFactory;
import com.personal.examples.creational.abstract_factory.transport._long.LongVehicle;
import com.personal.examples.creational.abstract_factory.transport._long.Truck;
import com.personal.examples.creational.abstract_factory.transport._short.ShortVehicle;
import org.junit.Test;

public class AbstracFactoryTest {

    @Test
    public void shouldCreate() {
        VehicleFactory vehicleFactory = new RoadVehicleFactory();
        LongVehicle truck = vehicleFactory.getLongVehicle();
        ShortVehicle pickup = vehicleFactory.getShortVehicle();
        System.out.println(truck.cargoWeight());
        System.out.println(pickup.cargoWeight());

        vehicleFactory = new SeaVehicleFactory();
        LongVehicle ship = vehicleFactory.getLongVehicle();
        ShortVehicle boat = vehicleFactory.getShortVehicle();
        System.out.println(ship.cargoWeight());
        System.out.println(boat.cargoWeight());
    }

}
