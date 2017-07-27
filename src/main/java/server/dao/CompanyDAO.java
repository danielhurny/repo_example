package server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import server.entity.Company;


@Component
@Transactional
public class CompanyDAO {

	
	@PersistenceContext
	private EntityManager entityManager;

	// ako ulozit aj employee - ho ktory je pod company?
	public Company saveCompany(Company company){

		entityManager.persist(company);
		
		return company;
	}
	
	public Company findOneById(int id) {
		return entityManager.find(Company.class, id); 
		
//		Object o = entityManager
//				.createQuery("select c from Company c where c.id = :id ")
//				.setParameter("id", id).getSingleResult();
//		return o == null ? null : ((Company) o);
	}
	
	public Company findOneByName(String name){
	
		
		Company toReturn = null; 
		try {
			toReturn = (Company) entityManager
					.createQuery("select c from Company c where c.name = :name ")
					.setParameter("name", name).getSingleResult();
		
			
		} catch (NoResultException e) {
			toReturn = null; 
		}
		
		return toReturn;
	}
	
	public List<Company> findAll(){
		Object o = entityManager
				.createQuery("select * from Company c ")
				.getResultList();
		return o == null ? null : ((List<Company>) o);
		
	}
}
