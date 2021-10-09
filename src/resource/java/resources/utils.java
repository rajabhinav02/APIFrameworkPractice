package resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class utils {

	
	public RequestSpecification requestSpec() {
				
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").build();
		return req;
}
	
	
	public ResponseSpecification respspec() {
		ResponseSpecification res = new ResponseSpecBuilder().expectStatusCode(200).build();
		return res;
	}
}