package Chapter11.BeepPrintExample3;

import java.awt.Toolkit;
public class BeepThread extends Thread{
        @Override
        public void run(){
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i=0; i<5; i++)
            {
                try{Thread.sleep(500);}catch(Exception e){}
            }
        }
    }

