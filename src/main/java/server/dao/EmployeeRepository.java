package server.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import server.entity.Employee;



@org.springframework.stereotype.Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>,
JpaSpecificationExecutor<Employee> {
	
	 Employee save(Employee employee);
	 
	 Employee findOne(Integer id);
	 
	 Employee findByName(String name);
	 
	 Employee findByFavouriteColour(String colour);
	
	 void deleteById(Integer id);
	 
	 int countByName(String s);

}
