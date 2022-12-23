package Project.Login;

import java.util.Scanner;

public class LoginApplication {
    private static int num = 0;
    private static final User[] user = new User[10];
    private static final Scanner scanner = new Scanner(System.in);
    private static String inputId, inputPwd, inputName;

    private static void create() {
        System.out.println("아이디를 입력하시오: ");
        inputId = scanner.next();
        System.out.println("비밀번호를 입력하시오: ");
        inputPwd = scanner.next();
        System.out.println("닉네임를 입력하시오: ");
        inputName = scanner.next();
        user[num] = new User(inputId, inputPwd, inputName);
//        System.out.println(user[num].toString());

        num++;
    }

    private static void login() {

//        System.out.println(user[num].getId());
        System.out.println("아이디를 입력하시오: ");
        inputId = scanner.next();
        System.out.println("비밀번호를 입력하시오: ");
        inputPwd = scanner.next(); //로그인 배열 비교하는 법 물어보기.

        for (int i = 0; i < user.length; i++) {
            if (inputId.equals(user[i].getId()) && inputPwd.equals(user[i].getPwd())) {
                System.out.println("로그인 성공");
                return;
            }
        }

        System.out.println("로그인 실패");
    }


    private static void look() {

        for (User users : user) {
            if (users == null) continue;
            if (users.getName() != null)
                System.out.println(users.getName());
        }
    }

    private static void delete() {
        System.out.println("아이디를 입력하시오: ");
        inputId = scanner.next();
        System.out.println("비밀번호를 입력하시오: ");
        inputPwd = scanner.next();  //배열비교를해서 일치하면 탈퇴를 성공했다고 말함.

        for (int i = 0; i < user.length; i++) {
            if (inputId.equals(user[i].getId()) && inputPwd.equals(user[i].getPwd())) {
                System.out.println("탈퇴 성공");
                user[i].setId(null);
                user[i].setPwd(null);
                user[i].setName(null);
                return;
            }
        }
        System.out.println("일치하는 정보 없음");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            user[i] = new User(null, null, null);
        }

        while (true) {
            System.out.println("원하는 메뉴를 입력하시오.");
            System.out.println("1.회원가입 2.로그인 3.사용자조회 4.탈퇴 5.종료");
            int select = scanner.nextInt();
            if (select == 1) {
                if (num == 10) {
                    System.out.println("회원가입인원 초과!!");
                    break;
                } else {
                    create();
                }
            } else if (select == 2) {
                login();
            } else if (select == 3) {
                look();
            } else if (select == 4) {
                delete();
            } else if (select == 5) {
                System.out.println("종료합니다.");
                break;
            }

        }

    }
}
