package StepDefinitions;

import Endpoints.Endpoint;
import io.cucumber.java.en.Given;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public class OtherSteps {

    private World world;
     Endpoint endpoint = new Endpoint();

    public OtherSteps(World world)
    {
        this.world = world;
    }

    @Given("service {string} is launched")
    public void serviceIsLaunched(String uri) {
        /*world.response = world.restTemplate.exchange(uri, HttpMethod.GET, new HttpEntity<String>(world.header1), String.class);
        System.out.println(world.response.getBody());*/
        endpoint.getResponse(world, uri);

    }

    @Given("login to analyst hub using {string}")
    public void loginToAnalystHubUsing(String id) {
        String serviceUrl = "http://ftc-lbdkrapp204.ad.moodys.net:4211/aop/analyst/"+id+"/issuers";
        world.response = world.restTemplate.exchange(serviceUrl, HttpMethod.GET, new HttpEntity<String>(world.header1), String.class);
        System.out.println(world.response.getBody());
    }
}
