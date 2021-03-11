package com.personal.examples.structural;

import com.personal.examples.structural.composite.ComponentProduct;
import com.personal.examples.structural.composite.CompositeProduct;
import com.personal.examples.structural.composite.LeafProduct;
import junit.framework.TestCase;
import org.junit.Assert;

public class CompositeTest extends TestCase {

    public void testComposite() {
        ComponentProduct tShirt = new LeafProduct("T-Shirt", 30.5);
        ComponentProduct pants = new LeafProduct("Pants", 60.75);
        ComponentProduct sneakers = new LeafProduct("Sneakers", 110.0);
        ComponentProduct box = new CompositeProduct();
        box.add(tShirt, pants, sneakers);

        ComponentProduct perfume = new LeafProduct("Perfume", 50.0);
        ComponentProduct watch = new LeafProduct("Watch", 500.75);
        ComponentProduct box2 = new CompositeProduct();
        box2.add(perfume, watch);
        box.add(box2);

        Assert.assertEquals(box.getPrice(), Double.valueOf(540.0));
    }

}
