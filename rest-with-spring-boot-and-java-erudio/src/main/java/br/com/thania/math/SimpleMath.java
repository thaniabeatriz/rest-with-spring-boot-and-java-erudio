package br.com.thania.math;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double sub(Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication(Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double div(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double media(Double numberOne, Double numberTwo) {

        return (numberOne + numberTwo) / 2;
    }

    public Double mean(Double number) {
        return Math.sqrt((number));
    }
}
