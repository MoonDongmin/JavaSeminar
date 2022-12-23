//package Chapater16.FromDirectotyExample;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.stream.Stream;
//
//public class FromDirectotyExample {
//    public static void main(String[] args) throws IOException{
//        Path path = Path.get("C:/JavaProgrammin/source");
//        Stream<Path> stream = Files.list(path);
//        stream.forEach(p->System.out.println(p.getFileName()));
//    }
//}
