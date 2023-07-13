package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Signup;

public class Dao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void insert(Signup s) {
		et.begin();
		em.persist(s);
		et.commit();
		System.out.println("Data is inserted");
	}
	
	public void update(int id) {
		Signup s=em.find(Signup.class, id);
		s.setName("Keerthi");
		s.setPhno(9901123487L);
		et.begin();
		em.merge(s);
		et.commit();
		System.out.println("Data is updated");
	}
	
	public void fetch(int id) 
	{
		Signup s2=em.find(Signup.class, id);
		System.out.println("ID:"+s2.getId()+" "+"Name"+" "+s2.getName()+" "+"PhoneNo"+" "+s2.getPhno());
	}
	public void delete(int id)
	{
		Signup s3=em.find(Signup.class, id);
		et.begin();
		em.remove(s3);
		et.commit();
		
		System.out.println("Data is deleted");
	}
}
