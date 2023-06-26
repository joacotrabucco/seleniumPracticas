package util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    public static Properties getPropertyObjet()throws IOException{
        FileInputStream fp = new FileInputStream("C:/Joaquin/Workspace/seleniumPracticas/bin/config/config.properties");
        
        Properties prop = new Properties();

        prop.load(fp);

        return prop;
    }

    public static String getUrl() throws IOException{
        return getPropertyObjet().getProperty("url");
    }
    public static String getUrlGuru() throws IOException{
        return getPropertyObjet().getProperty("urlGuru");
    }
    public static String getUsername() throws IOException{
        return getPropertyObjet().getProperty("username");
    }
    public static String getPassword() throws IOException{
        return getPropertyObjet().getProperty("password");
    }
}
