package Chapter18.FileInputStreamExaple;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void mina(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "C:/Developments/JavaSeminar/Chapter18/FileInputStreamexaple"
            );
            int data;
            while ((data = fis.read()) != -1) {
                System.out.write(data);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
