package com.personal.examples.structural.decorator.decorators;

import com.personal.examples.structural.decorator.ProductProtocol;

public class ProductStampDecorator extends ProductDecorator {

    public ProductStampDecorator(ProductProtocol productProtocol) {
        super(productProtocol);
    }

    @Override
    public String getName() {
        return super.getName() + " (stamp)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10;
    }

}
