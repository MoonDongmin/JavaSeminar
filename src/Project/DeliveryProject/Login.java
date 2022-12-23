package Project.DeliveryProject;

import java.util.Scanner;


public class Login {
    final static User[] user = new User[3];
    final static Scanner scanner = new Scanner(System.in);

    void createAccount(){
        int count = -1, i = 0;

        for(; i<user.length; i++){
            if(user[i]==null) break;
            else{count++;}
        }

        if(count==0){
            System.out.println("회원이 가득 참");
            return;
        }
        String id, pwd, nickName;

        System.out.print("아이디: ");
        id=scanner.next();

        System.out.print("비밀번호: ");
        pwd = scanner.next();

        System.out.print("닉네임: ");
        nickName=scanner.next();

        User newUser = new User(id, pwd,nickName);

        for(;i<user.length; i++){
            if(user[i]==null){
                user[i]=newUser;
                System.out.println("회원가입 성공");
                break;
            }
        }
    }

    boolean accessLogin(){
        int i=0;

        String id, pwd;
        System.out.print("아이디: ");
        id = scanner.next();

        System.out.print("비밀번호: ");
        pwd = scanner.next();

        for(; i<user.length;i++){
            if(id.equals(user[i].getId())&&pwd.equals(user[i].getPwd())) {
                System.out.println("로그인 성공");
                break;
            }else System.out.println("로그인 실패");
        }
        return false;
    }

    void delete(){
        System.out.print("아이디: ");
        String id = scanner.next();
        System.out.print("비밀번호: ");
        String pwd = scanner.next();
        System.out.println();

        for(int i=0; i<user.length; i++){
            if(user[i] != null){
                if(id.equals(user[i].getId())&&pwd.equals(user[i].getPwd())){
                    user[i] = null;
                    System.out.println("탈퇴성공\n");
                    break;
                }else System.out.println("탈퇴실패"); break;
            }
        }
    }
}
