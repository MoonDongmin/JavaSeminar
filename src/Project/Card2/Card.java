package Project.Card2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int n = scanner.nextInt();
        Queue<Integer> card2 = new LinkedList<>();

        for(int i=1; i<=n; i++){
            card2.add(i);
        }

        System.out.println("맨 위 카드번호: "+card2.peek());

        while(card2.size() > 1){
            card2.poll();
            card2.add(card2.poll());
            if(card2.size()!=1) {
                System.out.println("그 다음 카드 번호: " + card2.peek());
            }
        }

        System.out.println("마지막4 카드 번호: "+card2.poll());

    }
}
