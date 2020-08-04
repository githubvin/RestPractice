package smsworks;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class SingleSMS { 
	
	String jwToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJrZXkiOiI0ZmEyMjNkNy0zM2M3LTRmNzUtODY5Yi05MjFlOGU4NmNlMWYiLCJzZWNyZXQiOiI4ZWJjZmM0NjAwZDhmMjNkMzAwNzRhYThhM2E2OTY1ZGU3OWY2MGU2MzA1MTNkMTNiNzA1ZGQ0ZGIwMGEwYTFkIiwiaWF0IjoxNTk2Mzc1NTAyLCJleHAiOjIzODQ3NzU1MDJ9.eZlcZSTLgETbIyVdRnxaFesPknKfyd7-kwvuOCi0V8Q";
	
	@Test
	public void singleMessage() {  
		
		File reqFile = new File("./data/SingleSMS.json"); 
		
		RestAssured.baseURI = "https://api.thesmsworks.co.uk/v1/message/send"; 
		
		Response response = RestAssured 
		.given()
		.headers("Authorization", "JWT "+jwToken, 
				"Content-Type", "application/json")
		.when()
		.body(reqFile)
		.post();  
		
		/*
		 * This assertion get failed because of No Credits issue. 
		 * 
		 * .then()
		.assertThat()
		.statusCode(201)
		.extract()
		.response(); */
			
		response.prettyPrint(); 
		
		
	}

}
