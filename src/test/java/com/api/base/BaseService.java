package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.filters.LoggingFilter;
import com.api.models.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	
	public static final String BaseURI = "http://64.227.160.186:8080";
	RequestSpecification requestspecification;
	
	static{
		RestAssured.filters(new LoggingFilter());
	}
	
	public BaseService()
	{
		requestspecification = given().baseUri(BaseURI);
	}
	
	public Response postRequest(Object payload, String endpoint)
	{
		return requestspecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	public Response putRequest(Object payload, String endpoint)
	{
		return requestspecification.contentType(ContentType.JSON).body(payload).put(endpoint);
	}
	
	public Response getRequest(String endpoint)
	{
		return requestspecification.get(endpoint);
	}
	
	public void setAuthToken(String token)
	{
	
		requestspecification.header("Authorization", "Bearer " +token);
	}
	
	

}
