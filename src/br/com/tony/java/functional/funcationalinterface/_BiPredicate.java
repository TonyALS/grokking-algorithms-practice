package br.com.tony.java.functional.funcationalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;


/**
 * Represents a predicate (boolean-valued function) of two arguments.  This is
 * the two-arity specialization of {@link Predicate}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #test(Object, Object)}.
 *
 * @param <T> the type of the first argument to the predicate
 * @param <U> the type of the second argument the predicate
 *
 * @see Predicate
 * @since 1.8
 */
public class _BiPredicate {
    public static void main(String[] args) {
        String name = "John Doe";
        String contains = "Doe";

        System.out.println("--- With BiPredicate ---");
        System.out.println(containsStringBiPredicate.test(name, contains));
    }

    @SuppressWarnings("Convert2MethodRef")
    static BiPredicate<String, String> containsStringBiPredicate =
            (string, valueToVerify) -> string.contains(valueToVerify);
}
