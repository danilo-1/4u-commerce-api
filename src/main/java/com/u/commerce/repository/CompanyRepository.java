package com.u.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.u.commerce.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long>, CrudRepository<Company, Long> {
	
	Company findById(long id);	
}
