package br.com.tony.designpattern.behavioral.strategy;

public class TaxCalcContext {
    public void calc(TaxCalcStrategy calcStrategy) {
        calcStrategy.calcTax();
    }
}
