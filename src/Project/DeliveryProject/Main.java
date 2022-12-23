package Project.DeliveryProject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Vector<String> i = new Vector<String>();
    static Scanner sc = new Scanner(System.in);
    static Login login = new Login();
    static int s0;
    static int count=0;
    public static void main(String[] args) throws Exception {
        while (true) {
            String last;
            int s1,s2;
            System.out.println("--------------------------------");
            System.out.println("1.로그인  2.생성  3.탈퇴  4.종료");
            System.out.println("--------------------------------");
            System.out.print("번호를 입력하시오: ");
            s0 = sc.nextInt();
            if (s0 == 1) {
                login.accessLogin();
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
                    i.add("봉스키친");
                } else if (s2 == 2) {
                    GB Gb = new GB();
                    last = last + Gb.print();
                    i.add("국민돼지국밥");
                } else if (s2 == 3) {
                    BBACK B = new BBACK();
                    last = last + B.print();
                    i.add("뺵다방");
                } else if (s2 == 4) {
                    break;
                } else {
                    System.out.println("다시입력해주세요.");
                    continue;
                }
                System.out.println(last+"\n"+"배달순서:"+i);
            } else if (s0 == 2) {
                login.createAccount();
            } else if (s0 == 3) {
                login.delete();
            } else if (s0 == 4) {
                break;
            } else continue;
        }
    }
}
