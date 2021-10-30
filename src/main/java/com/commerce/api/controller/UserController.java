package com.commerce.api.controller;

import com.commerce.api.model.UserModel;
import com.google.gson.JsonArray;

import jakarta.ws.rs.*;

@Produces({ "application/json", "application/xml" })
@Path("/users")
public class UserController {

	@POST
	@Path("/register")
	public JsonArray registerUser(String name, String email, String password) throws Exception {
		UserModel model = new UserModel();
		
		JsonArray response = model.registerUser(name, email, password);
		
		return response;
	}
}
