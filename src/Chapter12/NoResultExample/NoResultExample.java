package Chapter12.NoResultExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
    public static void main(String[] args){
        ExecutorService executionService = Executors.newFixedThreadPool(
                Runtime.getRuntime().availableProcessors()
        );

        System.out.println("[작업 처리 요청]");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i=0; i<=10; i++){sum += i;}
                System.out.println("[처리 결고]"+sum);
            }
        };
        Future future = executionService.submit(runnable);

        try{
            future.get();
            System.out.println("[작업 처리 완료]");
        }catch(Exception e){
            System.out.println("[실행 예외 발생함]"+e.getMessage());
        }
        executionService.shutdown();
    }
}
