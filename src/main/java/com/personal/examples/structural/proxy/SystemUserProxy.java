package com.personal.examples.structural.proxy;

public class SystemUserProxy implements SystemUserProtocol {

    private SystemUserProtocol adminUser;
    private String[] addresses;

    public SystemUserProxy(SystemUserProtocol adminUser) {
        this.adminUser = adminUser;
    }

    private void createUser() {
        if (adminUser == null) {
            adminUser = new AdminUser();
        }
    }

    public String[] getAddresses() throws InterruptedException {
        createUser();

        if (addresses == null) {
            addresses = adminUser.getAddresses();
        }

        return addresses;
    }

}
