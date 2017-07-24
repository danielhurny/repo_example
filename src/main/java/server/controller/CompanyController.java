package server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import server.dto.CompanyDTO;
import server.dto.EmployeeDTO;
import server.entity.Employee;
import server.service.CompanyService;
import server.service.EmployeeService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	CompanyService companyService;

	@GetMapping("/{id}")
	public CompanyDTO getEmployeeByID(@PathVariable Integer id) {
		return companyService.findById(id);
	}

}
