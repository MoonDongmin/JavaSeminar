package Chapater16.ArratListVsLinkedListExmple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArratListVsLinkedListExmple {
    public static void work(int value){
    }

    //병렬처리
    public static long testParallel(List<Integer> list){
        long start = System.nanoTime();
        list.stream().parallel().forEach((a)->work(a));
        long end = System.nanoTime();
        long runTime=end - start;
        return runTime;
    }

    public static void main(String... args){
        //소스 컬렉션
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        for(int i=0; i<100000; i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        //워밍업
        long arrayListParallel = testParallel(arrayList);
        long linkedListParallel = testParallel(linkedList);

        //병렬 스트림 처리 시간 구하기
        arrayListParallel = testParallel(arrayList);
        linkedListParallel = testParallel(linkedList);

        if(arrayListParallel < linkedListParallel) {
            System.out.println("ArrayList가 더 빠름");
        }else{
            System.out.println("LinkdeList가 더 빠름");
        }
    }
}
