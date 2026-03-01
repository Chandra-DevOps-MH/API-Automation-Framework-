package com.resetAssured.LoginAPITest;

import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.request.UpdateProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import com.api.services.AuthServices;
import com.api.services.UserManagementService;

import io.restassured.response.Response;

public class UpdateProfileRequestTest {
	
	@Test
	public void UpdateProfileTest()
	{
		LoginRequest LoginRequest = new LoginRequest("Chandu981", "Chandu@1233");
		
		AuthServices authServices = new AuthServices();
		Response  response = authServices.login(LoginRequest);
		
		System.out.println("************Existing information***************");
		System.out.println(response.asPrettyString());
		
		LoginResponse LoginResponse = response.as(LoginResponse.class);
		
		LoginResponse.getToken();
		
		UpdateProfileRequest updateProfileRequest = new UpdateProfileRequest
				.Builder()
				.firstName("Rashmika")
				.lastName("Patil")
				.email("rashmikapatil99@gmail.com")
				.mobileNumber("9248756789")
				.build();
		
		UserManagementService usuerManagementService = new UserManagementService();
		Response response1 = usuerManagementService.updateProfile(LoginResponse.getToken(), updateProfileRequest);
		
		System.out.println("*************Updated information**************");
		
		//System.out.println(response1);
		
		
		
		UserProfileResponse UserProfileResponse = response1.as(UserProfileResponse.class);
		
		System.out.println(UserProfileResponse.getUsername());
		System.out.println(UserProfileResponse.getFirstName());
		
		System.out.println(UserProfileResponse.getEmail());
		System.out.println(UserProfileResponse.getMobileNumber());
		
	}

}
