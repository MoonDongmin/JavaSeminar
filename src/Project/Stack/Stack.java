package Project.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack {
    public static int stack[]; // 스택 배열
    public static int top=0; // 스택 포인트

    public static void main(String[] args)throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int command = Integer.parseInt(rd.readLine());

        stack = new int[command];

        for(int i=0;i<command;i++) {
            st = new StringTokenizer(rd.readLine(), " ");
            switch(st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    // 입력
    public static void push(int x) {
        stack[top] = x;
        ++top;
    }
    // 출력
    public static int pop() {
        if(top==0) {
            return -1;
        }else {
            int res = stack[top-1];
            top--;
            return res;
        }
    }
    // 사이즈 확인
    public static int size() {
        return top;
    }
    // 빈값 확인
    public static int empty() {
        if(top==0) {
            return 1;
        }else {
            return 0;
        }
    }
    // 최상단 값 확인
    public static int top() {
        if(top==0) {
            return -1;
        }else {
            return stack[top-1];
        }
    }
}

