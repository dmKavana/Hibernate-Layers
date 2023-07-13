package controller;

import dao.Dao1;
import dto.CreateTable1;

public class Controller1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CreateTable1 ct=new CreateTable1();
		ct.setId(1);
		ct.setName("Lavya");
		ct.setPhno(7654321189L);
		
		Dao1 d1=new Dao1();
		d1.insert(ct);

	}

}
