package Chapter8.VehicelExample;

public class VehicleExample {
    public static void main(String[] args){
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.checkFare();(x) -> Vehicle인터페이스에는 checkFare()가 없음

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare(); // Bus클래스에는 checkFare()가 있음.
    }
}
