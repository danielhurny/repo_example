package server.service;

import java.util.List;

import server.dto.EmployeeDTO;
import server.entity.Employee;

public interface EmployeeService {

	List<EmployeeDTO> getAll();

	EmployeeDTO findByName(String name);

	EmployeeDTO findById(Integer id);
	
	Employee saveDtoToDb (EmployeeDTO employeeDto);

}
