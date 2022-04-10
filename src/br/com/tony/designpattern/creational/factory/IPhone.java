package br.com.tony.designpattern.creational.factory;

public abstract class IPhone {
    private final String name;
    protected IPhone(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "name='" + name + '\'' +
                '}';
    }
}
