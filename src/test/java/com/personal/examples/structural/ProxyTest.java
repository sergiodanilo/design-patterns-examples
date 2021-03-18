package com.personal.examples.structural;

import com.personal.examples.structural.proxy.AdminUser;
import com.personal.examples.structural.proxy.SystemUserProtocol;
import com.personal.examples.structural.proxy.SystemUserProxy;
import junit.framework.TestCase;

import java.util.Arrays;

public class ProxyTest  extends TestCase {

    public void testProxy() throws InterruptedException {
        SystemUserProtocol adminUser = new AdminUser();
        SystemUserProtocol proxy = new SystemUserProxy(adminUser);

        System.out.println("-> Initializing ...");
        System.out.println(Arrays.toString(proxy.getAddresses()));

        System.out.println("-> After initialized! ");
        System.out.println(Arrays.toString(proxy.getAddresses()));
        System.out.println(Arrays.toString(proxy.getAddresses()));
        System.out.println(Arrays.toString(proxy.getAddresses()));
        System.out.println(Arrays.toString(proxy.getAddresses()));

    }

}
