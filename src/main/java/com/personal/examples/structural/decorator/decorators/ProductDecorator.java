package com.personal.examples.structural.decorator.decorators;

import com.personal.examples.structural.decorator.ProductProtocol;

public class ProductDecorator implements ProductProtocol {

    protected ProductProtocol product;

    public ProductDecorator() {
    }

    public ProductDecorator(ProductProtocol product) {
        this.product = product;
    }

    public String getName() {
        return this.product.getName();
    }

    public double getPrice() {
        return this.product.getPrice();
    }

}
