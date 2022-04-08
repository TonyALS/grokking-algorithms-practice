package br.com.tony.designpattern.strategy;

public class AppleTaxCalc implements TaxCalcStrategy {

    @Override
    public void calcTax() {
        System.out.println("This is a " + this.getClass().getSimpleName() + " calc strategy");
    }
}
