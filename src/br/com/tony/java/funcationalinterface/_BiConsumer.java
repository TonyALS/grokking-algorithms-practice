package br.com.tony.java.funcationalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Represents an operation that accepts two input arguments and returns no
 * result.  This is the two-arity specialization of {@link Consumer}.
 * Unlike most other functional interfaces, {@code BiConsumer} is expected
 * to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object, Object)}.
 *
 * @param <T> the type of the first argument to the operation
 * @param <U> the type of the second argument to the operation
 *
 * @see Consumer
 * @since 1.8
 */
public class _BiConsumer {
    public static void main(String[] args) {

        Customer customerOne = new Customer("Maria", "99999-9999");
        Customer customerTwo = new Customer("John", "88888-8888");

        System.out.println("--- Without BiConsumer ---");
        greetCustomer(customerOne, customerTwo);

        System.out.println("--- With BiConsumer ---");
        greetCustomerConsumer.accept(customerOne, customerTwo);
    }

    //  With BiConsumer
    static BiConsumer<Customer, Customer> greetCustomerConsumer =
            (customerOne, customerTwo) -> System.out.println(
                    "Hello " + customerOne.customerName + " and " + customerTwo.customerName  + "\n"
                            + "Phone 1 " + customerOne.customerPhoneNumber
                            + "Phone 2 " + customerTwo.customerPhoneNumber
            );

    //  Without BiConsumer
    static void greetCustomer(Customer customerOne, Customer customerTwo) {
        System.out.println(
                "Hello " + customerOne.customerName + " and " + customerTwo.customerName  + "\n"
                        + "Phone 1 " + customerOne.customerPhoneNumber
                        + "Phone 2 " + customerTwo.customerPhoneNumber
        );
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
