package controller;

import dao.Dao;
import dto.Signup;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For insertion
		Signup signup=new Signup();
		signup.setId(11);
		signup.setName("Laksh");
		signup.setPhno(9908765342L);
		
	Dao d1=new Dao();
		d1.insert(signup);
		
		//For Updation
		//Signup s1=new Signup();
				
		//d1.update(11);
		// d1.fetch(11);
		//d1.delete(11);

	}

}
