package com.resetAssured.LoginAPITest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.services.AuthServices;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


@Listeners(com.api.listeners.TestListener.class)
public class LoginTest3 {
	
	@Test(description = "Validate login API using RestAssured")
	public void LoginTestdemo()
	{
		LoginRequest loginRequest = new LoginRequest("Chandu981", "Chandu@1233");
		AuthServices authservice = new AuthServices();
		Response response = authservice.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getType());
		System.out.println(loginResponse.getId());
		System.out.println(loginResponse.getUsername());
		System.out.println(loginResponse.getEmail());
		System.out.println(loginResponse.roles);
		
		//Assert.assertTrue(loginResponse.getToken() != null);
		//Assert.assertEquals(loginResponse.getType(), "Bearer");
		//Assert.assertEquals(loginResponse.getId(), 38);
		//Assert.assertEquals(loginResponse.getUsername(), "string");
		Assert.assertEquals(loginResponse.getEmail(), "rashmikapatil99@gmail.com");
		//Assert.assertEquals(loginResponse.getRoles(), "ROLE_USER");
			
		
	}

}
