package br.com.tony.java.functional.funcationalinterface;

import java.util.function.Consumer;

/**
 * Represents an operation that accepts a single input argument and returns no
 * result. Unlike most other functional interfaces, {@code Consumer} is expected
 * to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object)}.
 *
 * @param <T> the type of the input to the operation
 *
 * @since 1.8
 */
public class _Consumer {
    public static void main(String[] args) {
        greetCustomer(new Customer("Maria", "99999-9999"));
        greetCustomerConsumer.accept(new Customer("John", "88888-8888"));
    }

    //  With Consumer
    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println(
                    "Hello " + customer.customerName +
                            ", thanks for registering phone number "
                            + customer.customerPhoneNumber);

    //  Without Consumer
    static void greetCustomer(Customer customer) {
        System.out.println(
                "Hello " + customer.customerName +
                        ", thanks for registering phone number "
                        + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
