package com.personal.examples.creational.factory_method;

import com.personal.examples.creational.factory_method.factories.Logistics;
import com.personal.examples.creational.factory_method.factories.RoadLogistics;
import com.personal.examples.creational.factory_method.factories.SeaLogistics;
import org.junit.Assert;
import org.junit.Test;

public class FactoryMethodTest {

    private int max = 10;
    private int min = 1;
    private int range = max - min + 1;
    private int rand = (int)(Math.random() * range) + min;

    @Test
    public void shouldCreateTransports() {
        Logistics logistics;

        if (rand % 2 == 0) {
            logistics = new RoadLogistics();
            Assert.assertEquals(logistics.planDelivery(), "This vehicle delivery by land in a box.");
        } else {
            logistics = new SeaLogistics();
            Assert.assertEquals(logistics.planDelivery(), "This vehicle delivery by sea in a container.");
        }

    }

}
