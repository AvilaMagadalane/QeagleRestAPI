package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class stepdefinition {

	public static RequestSpecification input;
	public static Response response;
	public static String sys_ID;

	@Given("Set Base URI")
	public void set_base_uri() {
		RestAssured.baseURI = "https://dev216519.service-now.com/api/now/table/";

	}

	@Given("Get Authentication as {string} and {string}")
	public void get_authentication_as_and(String string, String string2) {
		RestAssured.authentication = RestAssured.basic(string, string2);

	}

	@When("Create incident with requestbody {string}")
	public void create_incident_with_requestbody(String requestBody) {
		input = RestAssured.given().contentType("application/json").body(requestBody);
		response = input.post("incident");
		sys_ID = response.jsonPath().getString("result.sys_id");
		response.prettyPrint();

	}

	@Then("Validate the status code as {int}")
	public void validate_the_status_code_as(int statusCode) {
		response.then().assertThat().statusCode(statusCode);


	}

	@When("Get all incidents")
	public void get_all_incidents() {
		response = RestAssured.get("incident");

	}
	@When("Update incident with requestbody {string}")
	public void update(String updateBody) {
		input = RestAssured.given().contentType("application/json").body(updateBody);
		response  = input.put("incident/"+sys_ID);

	}


	@When("Delete incidents")
	public void delete_incidents() {
		response = input.delete("incident/"+sys_ID);
	
	}



}
