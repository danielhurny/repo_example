package server.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import server.dao.BranchDAO;
import server.dto.BranchDTO;
import server.mapper.BranchMapper;

@Component
@Transactional
public class BranchServiceImpl implements BranchService {
	
	@Autowired
	BranchMapper mapper;
	
	@Autowired
	BranchDAO dao; 
	
	/* (non-Javadoc)
	 * @see server.service.BranchService#getAll()
	 */
	@Override
	public List<BranchDTO> getAll() {
	return mapper.entitiesToDtos(dao.findAll());	
		
	}

	public List<BranchDTO> getByNumOfEmpl(int numOfEmpl) {
		return mapper.entitiesToDtos(dao.findByNumOfEmpl(numOfEmpl));
		
	}
	
	public List<BranchDTO> getByName(String expression) {
		return mapper.entitiesToDtos(dao.findByName(expression));
	}
	public List<BranchDTO> getByNumberName(String managerName, int numberOfEmpl) {
		return mapper.entitiesToDtos(dao.findByNumManager(managerName, numberOfEmpl));
	}
	
	public List<BranchDTO> getByRange(int min, int max) {
		return mapper.entitiesToDtos(dao.findByEmployeeRange(min, max));
	}
 }
