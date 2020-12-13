package com.personal.examples.creational.builder.director;

import com.personal.examples.creational.builder.builders.Builder;
import com.personal.examples.creational.builder.components.CarType;
import com.personal.examples.creational.builder.components.Engine;
import com.personal.examples.creational.builder.components.GPSNavigator;
import com.personal.examples.creational.builder.components.Transmission;
import com.personal.examples.creational.builder.components.TripComputer;

public class Director {

    public void makeSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void makeCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void makeSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
