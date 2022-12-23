package Chapter15.PropertiesExmaple;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExmaple {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        String path = PropertiesExmaple.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));

        String driver = properties.getProperty("dirver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("diver: "+driver);
        System.out.println("url: "+ url);
        System.out.println("username: "+username);
        System.out.println("password: "+password);
    }
}
