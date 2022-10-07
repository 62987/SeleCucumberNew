package StepDefination;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
    public String readPropertiesData(String s){
            Properties p = new Properties();
            try{
                p.load(new FileReader("Resource/HeropayoutData.properties"));
            }
        catch(Exception e){
                //System.out.println(e);
        }
            return p.getProperty(s);
    }
}
