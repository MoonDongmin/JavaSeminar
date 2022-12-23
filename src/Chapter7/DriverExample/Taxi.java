package Chapter7.DriverExample;

import Chapter7.DriverExample.Vehicle;

public class Taxi extends Vehicle {
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}
