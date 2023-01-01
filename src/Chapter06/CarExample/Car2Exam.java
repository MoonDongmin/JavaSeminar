package Chapter06.CarExample;

import Chapter06.CarExample.Car2;

public class Car2Exam {
    public static void main(String[] args){
        Car2 car1 = new Car2();
        System.out.println("car1.company: " + car1.company);
        System.out.println();

        Car2 car2 = new Car2("자가용");
        System.out.println("car2.company: " + car2.company);
        System.out.println("car2.model: " + car2.model);
        System.out.println();
    }
}
