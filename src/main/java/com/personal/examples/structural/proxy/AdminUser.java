package com.personal.examples.structural.proxy;

public class AdminUser implements SystemUserProtocol {

    public String[] getAddresses() throws InterruptedException {
        Thread.sleep(2000);
        return new String[]{"Street A, 666", "Street B, 888"};
    }

}
