package Chapter18.OutputStreamWriterExample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:/Temp/file1.txt");
        Writer writer = new OutputStreamWriter(fos);

        String data = "나는 문동민이야";
        writer.write(data);

        writer.flush();
        writer.close();
        System.out.println("파일 저장이 끝남");
    }
}
