package br.com.tony.designpattern.creational.singleton;

import java.util.Objects;

/**
 * Deve garantir que uma classe tenha somente uma instância no programa e fornecer
 * um ponto de acesso global para a mesma.
 * */
public final class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
