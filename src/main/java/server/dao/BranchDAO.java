package server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import server.entity.Branch;

@Component
@Transactional
public class BranchDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Branch> findAll() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Branch> q = cb.createQuery(Branch.class);
		Root<Branch> b = q.from(Branch.class);
		q.select(b);

		TypedQuery<Branch> query = entityManager.createQuery(q);
		return query.getResultList();
	}

	public List<Branch> findByNumOfEmpl(int number) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Branch> q = cb.createQuery(Branch.class);
		Root<Branch> b = q.from(Branch.class);
		ParameterExpression<Integer> p = cb.parameter(Integer.class);
		q.select(b).where(cb.gt(b.get("numOfEmpl"), p));

		TypedQuery<Branch> query = entityManager.createQuery(q);
		query.setParameter(p, number);
		return query.getResultList();
	}

	public List<Branch> findByName(String name) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Branch> q = cb.createQuery(Branch.class);
		Root<Branch> b = q.from(Branch.class);
		ParameterExpression<String> p = cb.parameter(String.class);

		q.select(b).where(cb.like(b.get("branchName"), p)
				);

		TypedQuery<Branch> query = entityManager.createQuery(q);
		query.setParameter(p, "%" + name + "%");
		return query.getResultList();
	}

	public List<Branch> findByNumManager(String manager, int numOfEmployees) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Branch> q = cb.createQuery(Branch.class);
		Root<Branch> b = q.from(Branch.class);
		ParameterExpression<Integer> p = cb.parameter(Integer.class);
		ParameterExpression<String> p1 = cb.parameter(String.class);
		q.where(cb.gt(b.get("numOfEmpl"), p), cb.like(b.get("manager"), p1)).orderBy(cb.desc(b.get("numOfEmpl")));

		// q.select(b).where(cb.gt(b.get("numOfEmpl"),p
		// ))).and(cb.like(b.get("manager"), p1))
		// );

		TypedQuery<Branch> query = entityManager.createQuery(q);
		query.setParameter(p, numOfEmployees);
		query.setParameter(p1, manager);

		return query.getResultList();

	}

	public List<Branch> findByEmployeeRange(int min, int max) {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		
		
		
		CriteriaQuery<Branch> q = cb.createQuery(Branch.class);
		Root<Branch> b = q.from(Branch.class);
		ParameterExpression<Integer> p1 = cb.parameter(Integer.class);
		ParameterExpression<Integer> p2 = cb.parameter(Integer.class);
//		aky to je predicate - generic type?- implementacia interface-u - original : public static Predicate<Employee> 
		Predicate orClause = cb.or(cb.le(b.get("numOfEmpl"), p1), cb.gt(b.get("numOfEmpl"), p2));
		Predicate inClause =b.get("branchName").in("ness", "ibm", "logitech");
		
		System.out.println(orClause.getClass());
		
		q.where(orClause, inClause ).orderBy(cb.desc(b.get("numOfEmpl")));

		TypedQuery<Branch> query = entityManager.createQuery(q);
		query.setParameter(p1, min);
		query.setParameter(p2, max);

		return query.getResultList();
	}

}
