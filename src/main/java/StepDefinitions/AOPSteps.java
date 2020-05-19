package StepDefinitions;

import Endpoints.Endpoint;
import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import static junit.framework.TestCase.assertEquals;


public class AOPSteps {

    private World world;
    Endpoint endpoint = new Endpoint();

    public AOPSteps(World world)
    {
        this.world = world;
    }


    @Then("verify status code is {string}")
    public void verifyStatusCodeIs(String status) {
      assertEquals (world.response.getStatusCode().toString(),status);
    }


    @Then("status code is OK")
    public void statusCodeIsOK() {
        /*System.out.println(world.response.getStatusCode().toString());
        assertEquals (world.response.getStatusCode(), HttpStatus.OK);*/
        endpoint.verifyResponse(world, "200");
    }

    @Then("status code is {string}")
    public void statusCodeIs(String status) {
        /*System.out.println(world.response.getStatusCode().toString());
        assertEquals (world.response.getStatusCode().toString(), status);*/
        endpoint.verifyResponse(world, status);
    }

    @BeforeStep
    public void doSomethingBeforeStep()
    {
    // put logging and transaction steps here
    }

    @AfterStep
    public void doSomethingAfterStep()
    {
        // put logging and transaction steps here
    }

    @Before() //@Before('@Single")
    public void doSomethingBeforeScenario()
    {
        world.header1.add("x-auth-token", world.apiKeyVal);
        // put logging and transaction steps here
    }

    @After
    public void doSomethingAfterScenario()
    {
        // put logging and transaction steps here
    }

    @Given("service {string} is launched for analyst {string}")
    public void serviceIsLaunchedForAnalyst(String URI, String analystID) {
        String serviceUrl = URI+analystID;
        world.response = world.restTemplate.exchange(serviceUrl, HttpMethod.GET, new HttpEntity<String>(world.header1), String.class);
        System.out.println(world.response.getBody());
    }
}
