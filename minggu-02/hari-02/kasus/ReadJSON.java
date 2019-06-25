import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ReadJSON
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("users.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray userList = new JSONArray();
            userList.add(obj);
            System.out.println(userList);
             
            //Iterate over employee array
            // userList.forEach( emp -> parseUserObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    // private static void parseUserObject(JSONObject user)
    // {
    //     JSONObject userObject = (JSONObject) user.get("user");
         
    //     String username = (String) userObject.get("username");   
    //     System.out.println(username);
         
    //     String location = (String) userObject.get("location"); 
    //     System.out.println(location);
         
    // }
}