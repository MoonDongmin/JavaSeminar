package Chapter7.ComputerExample;

import Chapter7.ComputerExample.Calculator;

public class Computer extends Calculator {
    @Override
    double areaCircle(double r){
        System.out.println("Compter 객체의 areaCircle() 실행");
        return Math.PI * r *r ;
    }
}
