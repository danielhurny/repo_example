package server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import server.dto.BranchDTO;
import server.service.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	BranchService bs;

	@GetMapping
	public List<BranchDTO> getAll() {
		return bs.getAll();

	}

	@GetMapping("/bynumber")
	public List<BranchDTO> getByuNumOfEmp(@RequestParam(value = "numbOfEmpl", required = true) int numOfEmpl) {
		return bs.getByNumOfEmpl(numOfEmpl);

	}

	@GetMapping("/byname")
	public List<BranchDTO> getByName(@RequestParam(value = "branchName", required = true) String name) {
		return bs.getByName(name);
	}

	@GetMapping("/bymanager")
	public List<BranchDTO> getByManagerNumber(@RequestParam(value = "manager", required = true) String manager,
			@RequestParam(value = "numOfEmpl", required = true) int numOfEmpl) {
		return bs.getByNumberName(manager, numOfEmpl);
	}
	@GetMapping("/byrange")
	public List<BranchDTO> getByRange (@RequestParam(value = "min", required = true) int min,
			                           @RequestParam(value = "max", required = true) int max) {
		return bs.getByRange(min, max);
	}

}
