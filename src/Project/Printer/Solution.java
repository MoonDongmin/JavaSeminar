package Project.Printer;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> printer = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            printer.add(priorities[i]);
        }

        while (!printer.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == printer.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    printer.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}