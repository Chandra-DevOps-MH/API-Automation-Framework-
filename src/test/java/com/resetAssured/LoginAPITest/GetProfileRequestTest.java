package com.resetAssured.LoginAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import com.api.services.AuthServices;
import com.api.services.UserManagementService;

import io.restassured.response.Response;


public class GetProfileRequestTest {
	
	@Test
	public void getProfileTest() {
	
	AuthServices authService = new AuthServices();
	
	LoginRequest loginRequest = new LoginRequest("Chandu981","Chandu@1233");
	
	Response response = authService.login(loginRequest);
	
	//System.out.println(response.asPrettyString());
	
	LoginResponse LoginResponse = response.as(LoginResponse.class);
	
	String token = LoginResponse.getToken();
	
	//System.out.println(token);
	
	UserManagementService userManagementService = new UserManagementService();
	Response response1 = userManagementService.getProfile(token);
	
	System.out.println(response1.asPrettyString());
	
	UserProfileResponse userProfileResponse = response1.as(UserProfileResponse.class);
	
	System.out.println(userProfileResponse.getFirstName());
	System.out.println(userProfileResponse.getLastName());
	
	Assert.assertEquals(userProfileResponse.getFirstName(), "Chandu123");
	Assert.assertEquals(userProfileResponse.getLastName(), "Ghasti");
	
	
	
	
	}

}
