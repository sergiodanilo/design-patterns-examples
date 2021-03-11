package com.personal.examples.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeProduct extends ComponentProduct {

    List<ComponentProduct> children = new ArrayList<>();

    @Override
    public Double getPrice() {
        return children.stream().mapToDouble(ComponentProduct::getPrice).reduce(0 , Double::sum);
    }

    public void add(ComponentProduct ...componentProducts) {
        children.addAll(Arrays.asList(componentProducts));
    }

    void remove(ComponentProduct componentProduct) {
        children.remove(componentProduct);
    }

}
