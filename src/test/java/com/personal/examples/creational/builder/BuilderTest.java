package com.personal.examples.creational.builder;

import com.personal.examples.creational.builder.builders.CarBuilder;
import com.personal.examples.creational.builder.builders.CarManualBuilder;
import com.personal.examples.creational.builder.cars.Car;
import com.personal.examples.creational.builder.cars.Manual;
import com.personal.examples.creational.builder.director.Director;
import org.junit.Test;

public class BuilderTest {

    @Test
    public void shouldCreateDiffInstances() {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.makeCityCar(carBuilder);

        Car car = carBuilder.getResult();

        System.out.println(car.getCarType());


        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.makeSUV(carManualBuilder);

        Manual suv = carManualBuilder.getResult();

    }

}
