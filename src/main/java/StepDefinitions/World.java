package StepDefinitions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class World {
    ResponseEntity response = null;
    HttpHeaders header1 = new HttpHeaders();
    RestTemplate restTemplate = new RestTemplate();
    String apiKeyVal =  "eyJhbGciOiJIUzI1NiJ9.eyJleHAiOjE1ODk0MDkzNDUsInVzZXIiOiJzaW5naHM0In0.aUndgC02yBJItbxFEUphUJ06nFwqL3outFhZe49wmIc";
}
