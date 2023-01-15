package Chapter07.CarExample;

import Chapter07.Protected.C;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();

            switch (problemLocation){
                case 1:
                    System.out.println("앞왼쪽 HankookTire로 교체");
                    car.frontLefTire = new HankookTire("앞왼쪽",15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 KumhooTire로 교체");
                    car.frontRighTire = new KumhoTire("앞오른쪽",13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 HankookTire로 교체");
                    car.backLefTire = new HankookTire("뒤왼쪽",14);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 KumhoTire로 교체");
                    car.backRighTire = new KumhoTire("뒤오른쪽",17);
                    break;
            }
            System.out.println("-----------------------");
        }
    }
}
