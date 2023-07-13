package dao;

import javax.persistence.*;

import dto.CreateTable1;

public class Dao1 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	public void insert(CreateTable1 ct)
	{
		et.begin();
		em.persist(ct);
		et.commit();
		System.out.println("Data is inserted");
	}
}
