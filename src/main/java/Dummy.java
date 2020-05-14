import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Dummy {
    static int var =10;

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("C:\\SampleProjects\\TestData\\AOP.json");
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

        JSONArray employeeList = (JSONArray) jsonObject.get("TC_01");
        System.out.println(employeeList.toString());

       // JSONObject employeeList =  (JSONObject) obj;
       // System.out.println(employeeList.get("TC_01").toString());
    }
}
