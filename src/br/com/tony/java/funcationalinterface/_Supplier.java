package br.com.tony.java.funcationalinterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

/**
 * Represents a supplier of results.
 *
 * <p>There is no requirement that a new or distinct result be returned each
 * time the supplier is invoked.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #get()}.
 *
 * @param <T> the type of results supplied by this supplier
 *
 * @since 1.8
 */
public class _Supplier {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- Without Supplier ---");
        System.out.println(getDbConnectionUrl());
        System.out.println("--- Without Supplier ---");
        System.out.println(getDbConnectionUrlSupplier.get());

        System.out.println("--- Supplier alternative example ---");
        //  Other example:
        //  https://stackoverflow.com/questions/40244571/when-we-should-use-supplier-in-java-8
        LocalDateTime defaultDateTime = LocalDateTime.now();
        Supplier<LocalDateTime> supplierDateTime = LocalDateTime::now;

        //  Sleep 2 seconds
        Thread.sleep(2000);

        //  Obtem o localdatetime do momento em que defaultDateTime foi executado (linha 27)
        System.out.println(defaultDateTime);

        //  Executa o localdatetime neste momento:
        System.out.println(supplierDateTime.get());

        //  Sleep 2 seconds
        Thread.sleep(2000);

        //  Obtem o localdatetime do momento em que defaultDateTime foi executado (linha 27)
        System.out.println(defaultDateTime);

        //  Executa o localdatetime neste momento:
        System.out.println(supplierDateTime.get());

    }

    static Supplier<String> getDbConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

    static String getDbConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
