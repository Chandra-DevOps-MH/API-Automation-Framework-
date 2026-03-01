package com.resetAssured.LoginAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.models.request.ResetPasswordRequest;
import com.api.models.request.SignUpRequest;
import com.api.services.AuthServices;

import io.restassured.response.Response;

public class PasswordResetTest {
	
	@Test(description = "Validate Password reset API using RestAssured")
	public void PasswordResetTest()
	{
		ResetPasswordRequest resetPasswordRequest = new ResetPasswordRequest.Builder()
		 .token("1ce46b3b-28bc-4031-8c59-ee3b0fa55246")
		 .newPassword("Chandra123")
		 .confirmPassword("Chandra123")
		 .Build();
		
		AuthServices authServices = new AuthServices();
		Response response = authServices.resetPassowrd(resetPasswordRequest);
		System.out.println(response.asPrettyString());
		
		 
	}

}
