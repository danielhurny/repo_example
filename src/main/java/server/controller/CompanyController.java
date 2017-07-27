package server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import server.dto.CompanyDTO;
import server.dto.EmployeeDTO;
import server.entity.Company;
import server.entity.Employee;
import server.service.CompanyService;
import server.service.EmployeeService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	CompanyService companyService;

	@GetMapping("/{id}")
	public CompanyDTO getCompanyByID(@RequestParam(value = "id", required = true) Integer id) {
		return companyService.findById(id);
	}
	@PostMapping("/save")
	public Company saveCompany(@RequestBody CompanyDTO companyDto){
		return companyService.saveCompanyToDb(companyDto);
		
	}
//	@GetMapping("/{name}")
//	public CompanyDTO getCompanyByName(@RequestParam(value = "name", required = true) String name){
//		return companyService.findByName(name);
//		
//	}

	@GetMapping("/{name}")
	public ResponseEntity<?> getCompanyByName2(@RequestParam(value = "name", required = true) String name){
		
		CompanyDTO findByName = companyService.findByName(name);
		
		return (findByName != null) ? new ResponseEntity<CompanyDTO>(findByName, HttpStatus.OK) : new ResponseEntity<CompanyDTO>(findByName, HttpStatus.NOT_FOUND); 
		
//		return new ResponseEntity<CompanyDTO>(findByName, HttpStatus.OK);
		
//		return null; 
//		return companyService.findByName(name);
		
	}
	
}
