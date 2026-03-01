package com.api.services;

import com.api.base.BaseService;
import com.api.models.request.LoginRequest;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UserManagementService extends BaseService {
	
	public static final String BASE_PATH = "/api/users";
	
	public Response getProfile(String token)
	{
		setAuthToken(token);
		return getRequest(BASE_PATH+ "/profile");
	}
	
	public Response updateProfile(String token, Object payload)
	{
		setAuthToken(token);
		return putRequest(payload, BASE_PATH+ "/profile");
	}

}
