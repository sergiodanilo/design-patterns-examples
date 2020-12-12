package com.personal.examples.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for Singleton class.
 */
public class SingletonTest {

    @Test
    public void shouldCreateOnlyOneInstance() throws InterruptedException {
        Singleton instance1 = Singleton.getInstance();
        Thread.sleep(1000);
        Singleton instance2 = Singleton.getInstance();
        Thread.sleep(1000);
        Singleton instance3 = Singleton.getInstance();

        assertEquals(instance1.getBirthday(), instance2.getBirthday());
        assertEquals(instance1.getBirthday(), instance3.getBirthday());
        assertEquals(instance2.getBirthday(), instance3.getBirthday());
    }

}