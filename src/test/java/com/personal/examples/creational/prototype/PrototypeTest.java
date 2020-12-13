package com.personal.examples.creational.prototype;

import com.personal.examples.creational.builder.builders.CarBuilder;
import com.personal.examples.creational.builder.builders.CarManualBuilder;
import com.personal.examples.creational.builder.cars.Car;
import com.personal.examples.creational.builder.cars.Manual;
import com.personal.examples.creational.builder.director.Director;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    @Test
    public void shouldPrototypesTheSame() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        Circle anotherCircle = (Circle) circle.clone();

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        Rectangle anotherRectangle = (Rectangle) rectangle.clone();

        Assert.assertEquals(circle, anotherCircle);
        Assert.assertEquals(rectangle, anotherRectangle);

    }

}
