package com.resetAssured.LoginAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.models.request.SignUpRequest;
import com.api.services.AuthServices;

import io.restassured.response.Response;

public class SignUpTest {
	
	@Test(description = "Validate Signup API using RestAssured")
	public void SignUpTest()
	{
		SignUpRequest signUpRequestnew = new SignUpRequest.Builder()
		.username("Chandu981")
		.firstName("Chandu123")
		.password("Chandu@1233")
		.lastName("Ghasti")
		.email("chandrakantghasti1998@gmail.com")
		.mobileNumber("9146923389").build();
		
		
		AuthServices authservices = new AuthServices();
		 Response response = authservices.signup(signUpRequestnew);
		 System.out.println(response.asPrettyString());
		 Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		 
	}

}
