package server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import server.entity.Company;


@Component
public class CompanyDAO {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Company saveCompany(Company company){
		entityManager.persist(company);
//		
		return company;
	}
	
	public Company findOneById(int id){
		Object o = entityManager
				.createQuery("select c from Company c where c.id = :id ")
				.setParameter("id", id).getSingleResult();
		return o == null ? null : ((Company) o);
	}
	
	public Company findOneById(String name){
		Object o = entityManager
				.createQuery("select c from Company c where c.name = :name ")
				.setParameter("name", name).getSingleResult();
		return o == null ? null : ((Company) o);
	}
	
	public List<Company> findAll(){
		Object o = entityManager
				.createQuery("select * from Company c ")
				.getResultList();
		return o == null ? null : ((List<Company>) o);
		
	}
}
