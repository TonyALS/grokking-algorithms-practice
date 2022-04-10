package br.com.tony.java.funcationalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Represents a function that accepts two arguments and produces a result.
 * This is the two-arity specialization of {@link Function}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(Object, Object)}.
 *
 * @param <T> the type of the first argument to the function
 * @param <U> the type of the second argument to the function
 * @param <R> the type of the result of the function
 *
 * @see Function
 * @since 1.8
 */
public class _BiFunction {
    public static void main(String[] args) {
        /*
        * BiFunction
        * */
        System.out.println("--- BiFunction ---");
        System.out.println("Without BiFunction");
        System.out.println(incrementByOneAndMultiply(0, 10));
        System.out.println("With BiFunction");
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(0, 10));
    }

    // Implementation with BiFunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;

    // Implementation without BiFunction
    static int incrementByOneAndMultiply(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }
}
