package server.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import server.dto.CompanyDTO;
import server.entity.Company;

@Component
public class CompanyMapper {

	@Autowired
	EmployeeMapper employeeMapper;

	// mohlo by to byt aj takto?? nevypisovalo ziadnu chybu hoci nebol
	// inicializovany, nawirovalo ho automaticky?
	// private EmployeeMapper employeeMapper;

	public CompanyDTO entityToDTO(Company company) {
		CompanyDTO companyDto = null;

		if (company != null) {
			companyDto = new CompanyDTO();
			companyDto.setAddress(company.getAddress());
			companyDto.setName(company.getName());
			companyDto.setNumberOfDepartments(company.getNumberOfDepartments());
			companyDto.setEmployees(employeeMapper.entitiesToDTOs(company.getEmployees()));

		}
		return companyDto;
	}

	public List<CompanyDTO> entitiesToDTOs(List<Company> entities) {
		// ak by som ju neinicializoval na null....co by vratila?
		List<CompanyDTO> listDTO = null;
		if (entities != null) {
			listDTO = new ArrayList();
			for (Company entity : entities) {
				listDTO.add(entityToDTO(entity));
			}
		}
		return listDTO;
	}
}
