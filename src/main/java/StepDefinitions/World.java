package StepDefinitions;

import Utils.Utils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

public class World {


    public ResponseEntity response = null;
    public HttpHeaders header1 = new HttpHeaders();
    public RestTemplate restTemplate = new RestTemplate();
    public String apiKeyVal = Utils.generateAccessToken("singhs4");


    public World() throws IOException {
    }
}
