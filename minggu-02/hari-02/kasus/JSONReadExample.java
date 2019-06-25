import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 
  
public class JSONReadExample  
{ 
    public static void main(String[] args) throws Exception  
    { 
        // parsing file "JSONExample.json" 
        Object obj = new JSONParser().parse(new FileReader("users.json")); 
          
        // typecasting obj to JSONObject 
        JSONObject jo = (JSONObject) obj; 
        // getting phoneNumbers 
        JSONArray ja = (JSONArray) jo.get("users"); 
        // Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
        // iterating phoneNumbers 
        Iterator itr2 = ja.iterator(); 
          
        while (itr2.hasNext())  
        { 
            Iterator<Map.Entry> itr1 = ((Map) itr2.next()).entrySet().iterator(); 
            while (itr1.hasNext()) { 
                Map.Entry pair = itr1.next(); 
                System.out.println(pair.getKey() + " : " + pair.getValue()); 
            } 
        } 
    } 
} 