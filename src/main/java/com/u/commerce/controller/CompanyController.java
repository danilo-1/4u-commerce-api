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
import org.springframework.web.bind.annotation.RestController;

import com.u.commerce.model.Company;
import com.u.commerce.model.User;
import com.u.commerce.repository.CompanyRepository;

@RestController
@RequestMapping(value = "/company")
@CrossOrigin(origins="http://localhost:8080")
public class CompanyController {

	@Autowired
	CompanyRepository companyRepository;

	@GetMapping("/get")
	public List<Company> getAllUsers() {
		return companyRepository.findAll();
	}

	@GetMapping("/get/{id}")
	public Company getUserById(@PathVariable(value = "id") long id) {
		return companyRepository.findById(id);
	}

	@PostMapping("/post")
	public Company insertUser(@RequestBody Company company) {
		return companyRepository.save(company);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCompany(@PathVariable(value = "id") long id) {
		companyRepository.deleteById(id);
	}
	
	@PutMapping("/edit")
	public Company editCompany(@RequestBody Company company) {
		return companyRepository.save(company);
	}
}
