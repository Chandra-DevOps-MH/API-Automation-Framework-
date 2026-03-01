package com.api.services;

import java.util.HashMap;

import com.api.base.BaseService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ResetPasswordRequest;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AuthServices extends BaseService{

	public static final String BASE_PATH = "/api/auth/";
	
	
	public Response login(LoginRequest payload)
	{
		return postRequest(payload, BASE_PATH+ "login");
	}
	
	public Response signup(SignUpRequest payload)
	{
		return postRequest(payload, BASE_PATH+ "signup");
	}
	
	public Response forgotPassword(String  forgotpasswordemail)
	{
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", forgotpasswordemail);
		return postRequest(payload, BASE_PATH+ "forgot-password");
	}
	
	public Response resetPassowrd(ResetPasswordRequest payload)
	{
		return postRequest(payload, BASE_PATH+ "signup");
	}
	
	
}
