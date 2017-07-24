package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import server.dao.CompanyDAO;
import server.dto.CompanyDTO;
import server.dto.EmployeeDTO;
import server.entity.Company;
import server.entity.Employee;
import server.mapper.CompanyMapper;

@Component
public class CompanyServiceImpl implements CompanyService {

	@Autowired
    CompanyMapper companyMapper;
	
	@Autowired
	CompanyDAO companyDao;
	
	
	
	/* (non-Javadoc)
	 * @see server.service.CompanyService#findById(java.lang.Integer)
	 */
	@Override
	public CompanyDTO findById(Integer id) {
		Company company = companyDao.findOneById(id);
		return companyMapper.entityToDTO(company);

	}
}

