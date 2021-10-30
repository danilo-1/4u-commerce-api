package com.commerce.api.model;

import com.commerce.api.repository.UserRepository;
import com.google.gson.JsonArray;

public class UserModel {
	
	public JsonArray registerUser(String name, String email, String password) throws Exception {
		
		JsonArray response = new JsonArray();
		
		try {
			
			UserRepository repository = new UserRepository();
			
			response = repository.registerUser(name, email, password);
			
			return response;
			
		} catch(Exception ex) {
			throw ex;
		}
		
	}

}
