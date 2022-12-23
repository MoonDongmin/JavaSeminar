package FinalTest.Cahp9.N4;

import FinalTest.Cahp9.N4.Car;

public class NestedClassExample {
    public static void main(String[] args){
        Car myCar = new Car();

        Car.Tire tire = myCar.new Tire();
        Car.Engine engine = new Car.Engine();
    }
}
