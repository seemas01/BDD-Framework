package TestRunner;/*
import javax.ws.rs.HttpMethod;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.HttpURLConnection;*/

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpMethod;
@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = "StepDefinitions")
//, plugin = {"pretty", "html:target/cucumber"}, monochrome=true, tags = {"@foo", "not @bar"})
public class Runner {

}
/*     //Jersey-jax-client
        Client client = ClientBuilder.newClient();
        WebTarget webTarget
                = client.target("http://ftc-lbdkrapp204.ad.moodys.net:4211/aop/analyst/");
        WebTarget employeeWebTarget
                = webTarget.path("29003272/issuers"); //change

        Invocation.Builder invocationBuilder
                = employeeWebTarget.request(MediaType.APPLICATION_JSON);

        Response response
                = invocationBuilder.get(Employee.class); // change



    }*/

   /* public Test() throws IOException {
    }

    // Given
    String name = RandomStringUtils.randomAlphabetic( 8 );
    HttpUriRequest request = new HttpGet( "https://api.github.com/users/" + name );

    // When
    HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );


*/




  /*  public void get(String uri) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> response =
                client.send(request, BodyHandlers.ofString());

        System.out.println(response.body());
    }*/

