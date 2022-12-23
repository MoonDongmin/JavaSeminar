package Chapter7.DriverExample;

import Chapter7.DriverExample.Bus;
import Chapter7.DriverExample.Driver;
import Chapter7.DriverExample.Taxi;

public class DriverExam {
    public static void  main(String[] args){
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
