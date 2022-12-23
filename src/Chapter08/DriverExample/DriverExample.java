package Chapter08.DriverExample;

public class DriverExample {
    public static void main(String[] args){
        Driver dirver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        dirver.drive(bus);
        dirver.drive(taxi);
    }
}
