package stepdef;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class FetchAllStudents {

private Response response;
private ValidatableResponse json;
private RequestSpecification request;
private String Base_URL = "http://localhost:3000/Student";


//https://www.googleapis.com/books/v1/volumes?q=isbn:9783642049569
@Given("hit the url$")
public void Student_url(){
request = RestAssured.given().param("");
}

@And("get Student Details$")
public void Student_Details(){
response = request.when().get(Base_URL);
}

@When("Validate status code as (\\d+)$")
public void verfy_stat_code(int statusCode){
json = response.then().statusCode(statusCode);
}

@Then("print Response body$")
public void Print_Response_bd(){
	ResponseBody body = response.getBody();
	System.out.println("Response Body is: " + body.asString());
}



}