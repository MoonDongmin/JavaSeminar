package Project.DeliveryProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeliveryMain {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while (true) {
            String last;
            int s1,s2;
            System.out.println("----------------------------------------");
            System.out.println("|거주지를 선택하시오.                  |\n");
            System.out.println("|1. 덕명동                             |\n");
            System.out.println("|2. 둔산동                             |\n");
            System.out.println("|3. 유성                               |\n");
            System.out.println("|4. 종료                               |\n");
            System.out.println("----------------------------------------");
            System.out.print("번호를 입력해 주세요: ");

            s1 = sc.nextInt();

            if (s1 == 1) {
                Deokmyeong DM = new Deokmyeong();
                last=DM.p();
            } else if (s1 == 2) {
                Dunsan Ds = new Dunsan();
                last = Ds.p();
                continue;
            } else if (s1 == 3) {
                Yuseong Ys = new Yuseong();
                last = Ys.p();
            } else if (s1 == 4) break;
            else {
                System.out.println("다시 입력해주세요!\n");
                continue;
            }

            System.out.println("\n----------------------------------------");
            System.out.println("|주문할 음식점을 선택하시오.           |\n");
            System.out.println("|1. 봉스키친                           |\n");
            System.out.println("|2. 국민돼지국밥                       |\n");
            System.out.println("|3. 빽다방                             |\n");
            System.out.println("|4. 종료                               |\n");
            System.out.println("----------------------------------------");
            System.out.println("번호를 입력해 주세요: ");
            s2 = sc.nextInt();

            if (s2 == 1) {
                Bk Bk = new Bk();
                last = last + Bk.print();
            } else if (s2 == 2) {
                GB Gb = new GB();
                last = last + Gb.print();
            } else if (s2 == 3) {
                BBACK B = new BBACK();
                last = last + B.print();
            } else if (s2 == 4) {
                break;
            } else {
                System.out.println("다시입력해주세요.");
                continue;
            }
            System.out.println(last);
        }
    }
}
