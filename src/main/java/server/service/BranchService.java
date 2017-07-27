package server.service;

import java.util.List;

import server.dto.BranchDTO;

public interface BranchService {

	List<BranchDTO> getAll();

	List<BranchDTO> getByNumOfEmpl(int numOfEmpl);

	List<BranchDTO> getByName(String expression);

	List<BranchDTO> getByNumberName(String managerName, int numberOfEmpl);

	List<BranchDTO> getByRange(int min, int max);

}