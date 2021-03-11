package com.personal.examples.structural.decorator.decorators;

import com.personal.examples.structural.decorator.ProductProtocol;

public class ProductCustomizeDecorator extends ProductDecorator {

    public ProductCustomizeDecorator(ProductProtocol productProtocol) {
        super(productProtocol);
    }

    @Override
    public String getName() {
        return super.getName() + " (customized)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 50;
    }

}
