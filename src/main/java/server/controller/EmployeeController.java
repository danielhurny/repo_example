package server.controller;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import server.dto.EmployeeDTO;
import server.entity.Employee;
import server.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET)
	public List<EmployeeDTO> getAll() {

		return employeeService.getAll();
	}

	@GetMapping("/{id}")
	public EmployeeDTO getEmployeeByID(@PathVariable Integer id) {
		return employeeService.findById(id);
	}

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody EmployeeDTO employeeDto) {
		return employeeService.saveDtoToDb(employeeDto);
	}

}
