package server.service;

import org.springframework.http.ResponseEntity;

import server.dto.CompanyDTO;
import server.entity.Company;

public interface CompanyService {

	CompanyDTO findById(Integer id);
	
	Company saveCompanyToDb(CompanyDTO companyDto);
	
	CompanyDTO findByName(String name);

}