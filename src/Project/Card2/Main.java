package Project.Card2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> card2 = new LinkedList<>();

        for(int i=1; i<=n; i++){
            card2.add(i);
        }

        while(card2.size() > 1){
            card2.poll();
            card2.add(card2.poll());
        }
        System.out.println(card2.poll());
    }
}
