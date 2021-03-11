package com.personal.examples.structural;

import com.personal.examples.structural.decorator.ProductProtocol;
import com.personal.examples.structural.decorator.TShirt;
import com.personal.examples.structural.decorator.decorators.ProductCustomizeDecorator;
import com.personal.examples.structural.decorator.decorators.ProductStampDecorator;
import junit.framework.TestCase;

public class DecoratorTest extends TestCase {

    public void testDecorator() {
        String name = "My t-shirt";
        double price = 49.9;

        ProductProtocol tShirt = new TShirt(name, price);
        assertEquals(tShirt.getName(), name);
        assertEquals(tShirt.getPrice(), price);

        ProductProtocol tShirtStamp = new ProductStampDecorator(tShirt);
        assertEquals(tShirtStamp.getName(), name + " (stamp)");
        assertEquals(tShirtStamp.getPrice(), price + 10);

        ProductProtocol tShirtCustomized = new ProductCustomizeDecorator(tShirtStamp);
        assertEquals(tShirtCustomized.getName(), name + " (stamp) (customized)");
        assertEquals(tShirtCustomized.getPrice(), price + + 10 + 50);

    }

}
