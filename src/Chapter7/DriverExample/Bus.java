package Chapter7.DriverExample;

import Chapter7.DriverExample.Vehicle;

public class Bus extends Vehicle {
    @Override
    public void run(){
        System.out.println("버스가 달립니다.");
    }
}
