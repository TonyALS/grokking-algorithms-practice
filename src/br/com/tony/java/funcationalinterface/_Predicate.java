package br.com.tony.java.funcationalinterface;

import java.util.function.Predicate;


/**
 * Represents a predicate (boolean-valued function) of one argument.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #test(Object)}.
 *
 * @param <T> the type of the input to the predicate
 *
 * @since 1.8
 */
public class _Predicate {
    public static void main(String[] args) {
        String validPhoneNumber = "+5599999999";
        String invalidPhoneNumber = "00099999999";

        System.out.println("--- Without Predicate ---");
        System.out.println(isPhoneNumberValid(validPhoneNumber));
        System.out.println(isPhoneNumberValid(invalidPhoneNumber));

        System.out.println("--- With Predicate ---");
        System.out.println(isPhoneNumberValidPredicate.test(validPhoneNumber));
        System.out.println(isPhoneNumberValidPredicate.test(invalidPhoneNumber));

        System.out.println("--- With Predicate Combination ---");
        System.out.println(startsWithPhonePredicate.and(lenghtPhonePredicate)
                .test(validPhoneNumber));

        System.out.println(startsWithPhonePredicate.and(lenghtPhonePredicate)
                .test(invalidPhoneNumber));

    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber
            .startsWith("+55") && phoneNumber.length() == 11;

    static Predicate<String> startsWithPhonePredicate = phoneNumber -> phoneNumber
            .startsWith("+55");

    static Predicate<String> lenghtPhonePredicate = phoneNumber -> phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+55") && phoneNumber.length() == 11;
    }
}
