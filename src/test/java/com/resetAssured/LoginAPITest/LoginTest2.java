package com.resetAssured.LoginAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginTest2 {
	
	@Test(description = "Validate login API using RestAssured")
	public void LoginTestdemo()
	{
		
		Response reponse = RestAssured.given().baseUri("http://64.227.160.186:8080").header("Content-Type", "application/json").body("{\"username\": \"string\", \"password\": \"string\"}").post("/api/auth/login");
		System.out.println(reponse.asPrettyString());
		
		Assert.assertEquals(reponse.getStatusCode(), 200);
		
		
		
	}

}
