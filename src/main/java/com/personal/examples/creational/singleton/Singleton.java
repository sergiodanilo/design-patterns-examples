package com.personal.examples.creational.singleton;

import java.util.Date;

/**
 *
 *   Garantir que uma classe tenha somente uma instância no programa
 * e fornecer um ponto de acesso global para a mesma.
 *
 * @author sergiodanilo
 * @since 2020-12-12
 * @version 1.0
 */
public class Singleton {

    private static final Singleton instance = new Singleton();
    private static Date birthday = new Date();

    private Singleton() {
        this.birthday = new Date();
    }

    public static Singleton getInstance() {
        return instance;
    }

    public Date getBirthday() {
        return this.birthday;
    }

}
