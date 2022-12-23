//package Chapater16.FromFileContentExample;
//
//import java.io.*;
//import java.nio.charset.Charset;
//import java.nio.file.Path;
//import java.util.stream.Stream;
//
//public class FromFileContentExample {
//    public static void main(String[] args)throws IOException{
//        Path path = Path.get("src/sec02/stream_kind/linedata.txt");
//        Stream<String> stream;
//
//        //파일라이센스
//        stream = File.lines(path, Charset.defaultCharset());
//        stream.forEach(System.err::println);
//        System.out.println();
//
//        //BufferedReader의 lines()메소드 이용
//        File file = path.toFile();
//        FileReader fileReader = new FileReader(file);
//        BufferedReader br = new BufferedReader(fileReader);
//        stream = br.lines();
//        stream.forEach(System.out::println);
//    }
//}
