package Chapter07.CarExample;

public class Car {
    Tire frontLefTire = new Tire("앞왼쪽", 6);
    Tire frontRighTire = new Tire("앞오른", 2);
    Tire backLefTire = new Tire("뒤왼쪽", 3);
    Tire backRighTire = new Tire("뒤오른쪽", 4);

    int run() {
        System.out.println("[자동차가 달립니다.]");
        if (frontLefTire.roll() == false) {
            stop();
            return 1;
        }
        if (frontRighTire.roll() == false) {
            stop();
            return 2;
        }
        if (backLefTire.roll() == false) {
            stop();
            return 3;
        }
        if (backRighTire.roll() == false) {
            stop();
            return 4;
        }
        return 0;
    }


    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
