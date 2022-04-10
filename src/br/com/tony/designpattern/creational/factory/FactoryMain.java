package br.com.tony.designpattern.creational.factory;


/**
 * O Factory Method é um padrão criacional de projeto que fornece uma interface
 * para criar objetos em uma superclasse, mas permite que as subclasses alterem
 * o tipo de objetos que serão criados.
 * */
public class FactoryMain {
    public static void main(String[] args) {
        IPhoneFactory iPhoneFactory = new IPhoneSimpleFactory();

        IPhone iPhoneX = iPhoneFactory.createIPhone("X");
        IPhone iPhone11 = iPhoneFactory.createIPhone("11");

        System.out.println(iPhoneX);
        System.out.println(iPhone11);
    }
}
