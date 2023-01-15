package Chapter06.CalculatorExample;

import Chapter06.CalculatorExample.Calculator;

public class CalculatorExam {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);
    }
}
