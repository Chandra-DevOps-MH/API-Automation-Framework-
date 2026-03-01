package com.resetAssured.LoginAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginTest {
	
	@Test(description = "Validate login API using RestAssured")
	public void LoginTestdemo()
	{
		RestAssured.baseURI = "http://64.227.160.186:8080";
		RequestSpecification x = RestAssured.given();
		RequestSpecification y = x.header("Content-Type", "application/json");
		RequestSpecification z = y.body("{\"username\": \"string\", \"password\": \"string\"}");
		Response reponse = z.post("/api/auth/login");
		System.out.println(reponse.asPrettyString());
		
		Assert.assertEquals(reponse.getStatusCode(), 200);
		
		
		
	}

}
