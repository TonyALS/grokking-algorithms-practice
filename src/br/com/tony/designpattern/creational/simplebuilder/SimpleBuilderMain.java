package br.com.tony.designpattern.creational.simplebuilder;

public class SimpleBuilderMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder("John", "Doe")
                .age(25)
                .phone("+5599123456")
                .address("Rua A")
                .build();

        System.out.println(user);
    }
}
