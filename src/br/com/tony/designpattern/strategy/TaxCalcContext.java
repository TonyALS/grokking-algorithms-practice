package br.com.tony.designpattern.strategy;

public class TaxCalcContext {
    public void calc(TaxCalcStrategy calcStrategy) {
        calcStrategy.calcTax();
    }
}
