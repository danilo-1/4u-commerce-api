package com.commerce.api.repository;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;

public class UserRepository {
	
	public JsonArray registerUser(String name, String email, String password) throws Exception {
		StringBuilder sbSQL = new StringBuilder();
		sbSQL.append(" INSERT INTO public.USER ");
		sbSQL.append(" (NAME, EMAIL, PASSWORD) ");
		sbSQL.append(" VALUES (?, ?, ?) ");
		
		List<Object> parameters = new ArrayList<>();
		parameters.add(name);
		parameters.add(email);
		parameters.add(password);
		
		return 
	}
}
