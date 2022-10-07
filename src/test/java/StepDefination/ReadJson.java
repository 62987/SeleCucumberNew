package StepDefination;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.xml.bind.Element;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadJson {
    public String readJsonData(String key) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        String val="";
        try  {
            //Read JSON file
            FileReader reader = new FileReader("Resource/LeadData.Json");
            Object obj = jsonParser.parse(reader);

           val=parseObject((JSONObject) obj,key);
            System.out.println(obj);

        } catch (Exception e) {
            System.out.println(e);
        }
        return val;

    }
    private static String parseObject(JSONObject jsonObject,String key)
    {
        //Get employee object within list
        String value = jsonObject.get(key).toString();

        return value;
    }
}


           //try {

            //JSONParser json = new JSONParser();
            //FileReader file = new FileReader("Resource/LeadData.Json");
            //Object obj = json.parse(file);
            //List<Element> userlist = (List<Element>) obj;
            //List<JSONArray> userlist= List<JSONArray> obj;
            //System.out.println(userlist);
            //for (int i = 0; i < userlist.size(); i++) {
              //  JSONObject u = (JSONObject) userlist.get(i);
                //u.put("result", u);
           // }

      //  catch (Exception e) {
            //System.out.println(e);
      //  }
       // return readJsonData(key);
   // }
//}
