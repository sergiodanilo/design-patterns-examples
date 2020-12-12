package com.personal.examples.creational.builder.builders;

import com.personal.examples.creational.builder.cars.CarType;
import com.personal.examples.creational.builder.cars.Manual;
import com.personal.examples.creational.builder.components.Engine;
import com.personal.examples.creational.builder.components.GPSNavigator;
import com.personal.examples.creational.builder.components.Transmission;
import com.personal.examples.creational.builder.components.TripComputer;

/**
 *
 *   Concrete builder for manual car.
 */
public class CarManualBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

}
