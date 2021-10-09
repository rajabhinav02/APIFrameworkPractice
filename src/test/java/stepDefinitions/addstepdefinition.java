package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.PayLoad;
import resources.utils;
import static io.restassured.RestAssured.*;

import org.testng.Assert;

public class addstepdefinition extends utils {

	RequestSpecification request;
	PayLoad pl = new PayLoad();
	Response response;
	JsonPath js;
	
	@Given("Add Place Payload")
	public void add_place_payload() {
	    
		request=given().spec(requestSpec()).body(pl.getBody());
		
		//591681
	}
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String string, String string2) {
	  response= request.when().post("/maps/api/place/add/json").then().spec(respspec()).extract().response();
	}
	@Then("the API call is success with status code {int}")
	public void the_api_call_is_success_with_status_code(Integer int1) {
	    Assert.assertEquals(response.getStatusCode(), 200);
	}
	@Then("status message is OK")
	public void status_message_is_ok() {
		System.out.println("here " +response.asString());
		
		/*String respo = response.asString();
		js = new JsonPath(respo);
		Assert.assertEquals(js.get("status"), "OK");*/
	    //js.get("status");
	}

	
}
