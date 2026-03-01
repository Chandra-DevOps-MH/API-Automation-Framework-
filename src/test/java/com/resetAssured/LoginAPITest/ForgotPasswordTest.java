package com.resetAssured.LoginAPITest;

import org.testng.annotations.Test;

import com.api.services.AuthServices;

import io.restassured.response.Response;

public class ForgotPasswordTest {

	@Test(description = "Validate forgot password API using RestAssured")
	public void ForgotPassowrdTest() {
		AuthServices authService = new AuthServices();
		Response response = authService.forgotPassword("chandrakantghasti1998@gmail.com");
		System.out.println(response.asPrettyString());
		

	}

}
