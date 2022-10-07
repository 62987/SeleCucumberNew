package StepDefination;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Json {
    public String readData(String s) throws IOException {
        Properties p = new Properties();
        try {

            p.load(new FileReader("Resource/LeadData.Json"));
        }
        catch (Exception e)
        {

        }
        return p.getProperty(s);
    }
}
