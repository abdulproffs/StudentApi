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

public class FetchStudentById{

private Response response;
private ValidatableResponse json;
private RequestSpecification request;
private String Base_URL = "http://localhost:3000/Student/101";

//https://www.googleapis.com/books/v1/volumes?q=isbn:9783642049569
@Given("Request with Id \"(.*)\"$")
public void Student_Exist(String isbn){
request = RestAssured.given().param("");
}

@And("Student gets retrieve by id$")
public void Student_Retrieve(){
response = request.when().get(Base_URL);
}

@When("Validate status code will be (\\d+)$")
public void verify_stat_code(int statusCode){
json = response.then().statusCode(statusCode);
}

@Then("Print Response$")
public void Print_Response(){
	ResponseBody body = response.getBody();
	System.out.println("Response Body is: " + body.asString());
}

}