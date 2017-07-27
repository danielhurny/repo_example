package server.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import server.dto.EmployeeDTO;
import server.entity.Employee;


@Component
public class EmployeeMapper {

	public EmployeeDTO entityToDTO(Employee employee) {
		// null?
		EmployeeDTO employeeDTO = null;

		if (employee != null) {
			employeeDTO = new EmployeeDTO();
			employeeDTO.setComment(employee.getComment());
			employeeDTO.setAddress(employee.getAddress());
			employeeDTO.setName(employee.getName());
		}

		return employeeDTO;
	}

	public List<EmployeeDTO> entitiesToDTOs(List<Employee> entities) {
		// null?
		List<EmployeeDTO> listDTO = null;
		if (entities != null) {
			listDTO = new ArrayList<EmployeeDTO>();
			for (Employee entity : entities) {
				listDTO.add(entityToDTO(entity));
			}
		}
		return listDTO;

	}

	public Employee dtoToEmployee(EmployeeDTO employeeDto) {
		Employee employee = null;
		if (employeeDto != null) {
			employee = new Employee();
			employee.setComment(employeeDto.getComment());
			employee.setAddress(employeeDto.getAddress());
			employee.setName(employeeDto.getName());
			employee.setFavouriteColour(employeeDto.getColour());
			employee.setCompanyId(employeeDto.getCompanyId());
		}
		return employee;
	}
	
	// ma to vobec v tomto pripade zmysel? nestaci len pre jedneho Employee?
	public List<Employee> listToEmployee(List<EmployeeDTO> list){
		List<Employee> listEmployee = null;
		if(list!=null){
			listEmployee= new ArrayList<Employee>();
			for(EmployeeDTO e:list){
				listEmployee.add(dtoToEmployee(e));
			}
			
		}
		return listEmployee;
	}

}
