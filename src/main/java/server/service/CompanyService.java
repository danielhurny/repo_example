package server.service;

import server.dto.CompanyDTO;

public interface CompanyService {

	CompanyDTO findById(Integer id);

}