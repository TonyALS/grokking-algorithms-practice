package br.com.tony.designpattern.behavioral.strategy;

/**
 * Padrao strategy
 * Muito utilizado para evitar if else em codigo, facilita a extensao de comportamento.
 * TaxCalcStrategy define a assinatura de um metodo que deve ser implementado concretamente por
 * cada estrategia.
 * TaxCalcContext classe que invoca as estrategias, nesse momento deve-se fornecer a implementacao
 * concreta do TaxCalcStrategy
 * @author tony
 * */
public class StrategyMain {
    public static void main(String[] args) {
        var taxCalcContext = new TaxCalcContext();

        taxCalcContext.calc(new AppleTaxCalc());
        taxCalcContext.calc(new SamsungTaxCalc());
    }
}
