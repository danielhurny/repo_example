package server.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import server.dto.BranchDTO;
import server.entity.Branch;

@Component
public class BranchMapper {
	
	public BranchDTO entityToDto(Branch entity) {
		BranchDTO dto = null;
		if(entity!=null) {
			dto = new BranchDTO();
			dto.setBranchName(entity.getBranchName());
			dto.setManager(entity.getManager());
			dto.setNumOfEmpl(entity.getNumOfEmpl());
			dto.setId(entity.getId());
		}
		return dto;
	}
	
	public List<BranchDTO> entitiesToDtos(List<Branch> entities) {
		List<BranchDTO> dtos = null;
		if(entities != null) {
			dtos = new ArrayList<>();
			for(Branch entity : entities) {
				dtos.add(entityToDto(entity));
			}
		}
		return dtos;
	} 

}
