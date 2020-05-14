package StepDefinitions;

import Utils.Utils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class World {
    ResponseEntity response = null;
    HttpHeaders header1 = new HttpHeaders();
    RestTemplate restTemplate = new RestTemplate();
    String apiKeyVal = Utils.generateAccessToken("singhs4");

   // Scenario scenario = new Scenario();

    public World() throws IOException {
    }
}
