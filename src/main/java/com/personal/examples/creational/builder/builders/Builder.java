package com.personal.examples.creational.builder.builders;

import com.personal.examples.creational.builder.components.CarType;
import com.personal.examples.creational.builder.components.Engine;
import com.personal.examples.creational.builder.components.GPSNavigator;
import com.personal.examples.creational.builder.components.Transmission;
import com.personal.examples.creational.builder.components.TripComputer;

/**
 *
 *   Separar a construção de um objeto complexo da sua representação de modo
 * que o mesmo processo de construção possa criar diferentes representações.
 *
 * @author sergiodanilo
 * @since 2020-12-12
 * @version 1.0
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
