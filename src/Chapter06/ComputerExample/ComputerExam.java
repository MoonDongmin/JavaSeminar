package Chapter06.ComputerExample;

import Chapter06.ComputerExample.Computer;

public class ComputerExam {
    public static void main(String[] args){
        Computer myCom = new Computer();

        int[] values1 = {1,2,3};
        int result1 = myCom.sum1(values1);
        System.out.println("result1: " + result1);

        int result2 = myCom.sum2(1,2,3);
        System.out.println("result2 : " + result2);
    }
}
