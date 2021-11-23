package com.u.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.u.commerce.model.Login;
import com.u.commerce.model.User;
import com.u.commerce.repository.UserRepository;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:8080")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping("/get")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/get/{id}")
	public User getUserById(@PathVariable(value = "id") long id) {
		return userRepository.findById(id);
	}

	@PostMapping("/post")
	public User insertUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable(value = "id") long id) {
		userRepository.deleteById(id);
	}

	@PutMapping("/edit")
	public User editUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@PostMapping("/login")
	public Boolean login(@RequestBody Login login) {

		System.out.println(login.getEmail());
		System.out.println(login.getPassword());

		User aux = userRepository.login(login.getEmail(), login.getPassword());

		if (aux != null) {
			return true;
		} else {
			return false;
		}
	}
}
