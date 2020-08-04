package smsworks;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMessage { 
	
	String jwToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJrZXkiOiI0ZmEyMjNkNy0zM2M3LTRmNzUtODY5Yi05MjFlOGU4NmNlMWYiLCJzZWNyZXQiOiI4ZWJjZmM0NjAwZDhmMjNkMzAwNzRhYThhM2E2OTY1ZGU3OWY2MGU2MzA1MTNkMTNiNzA1ZGQ0ZGIwMGEwYTFkIiwiaWF0IjoxNTk2Mzc1NTAyLCJleHAiOjIzODQ3NzU1MDJ9.eZlcZSTLgETbIyVdRnxaFesPknKfyd7-kwvuOCi0V8Q";
	
	@Test
	public void getMsgID() { 
		
		RestAssured.baseURI = "https://api.thesmsworks.co.uk/v1/batch/6284373"; 

		Response response = RestAssured 
				.given()
				.headers("Authorization", "JWT "+jwToken, 
						"Content-Type", "application/json") 
				.when()
				.get(); 
		
		response.prettyPrint();
		
		
	}

}
