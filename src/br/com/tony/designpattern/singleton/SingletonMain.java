package br.com.tony.designpattern.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance.equals(instance2));
    }
}
