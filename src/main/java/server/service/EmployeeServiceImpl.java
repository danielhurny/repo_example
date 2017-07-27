package server.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import server.dao.EmployeeRepository;
import server.dto.EmployeeDTO;
import server.entity.Employee;
import server.mapper.EmployeeMapper;


@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeMapper mapper;

	@Autowired
	EmployeeRepository repository;

	@Override
	public List<EmployeeDTO> getAll() {

		
		List<Employee> findAll = repository.findAll();
		System.out.println(repository.getClass());

		return mapper.entitiesToDTOs(findAll);
	}

	public EmployeeDTO findByName(String name) {

		Employee employee = repository.findByName(name);
		return mapper.entityToDTO(employee);

	}

	public EmployeeDTO findById(Integer id) {
		Employee employee = repository.findOne(id);
		return mapper.entityToDTO(employee);

	}
	public Employee saveDtoToDb (EmployeeDTO employeeDto){
		
		return repository.save(mapper.dtoToEmployee(employeeDto));
		
	}
	

}
