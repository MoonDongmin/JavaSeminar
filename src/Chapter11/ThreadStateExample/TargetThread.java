package Chapter11.ThreadStateExample;

public class TargetThread extends Thread{
    public void run(){
        for(long i=0; i<100000000; i++){}

        try{
            Thread.sleep(1500);
        }catch (Exception e){}

        for(long i=0; i<100000000; i++){}
    }
}
