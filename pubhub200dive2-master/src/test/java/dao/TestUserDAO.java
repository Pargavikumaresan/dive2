package dao;

import java.util.logging.Logger;

import model.Book;
import model.User;

public class TestUserDAO {
	public static final Logger logger = Logger.getLogger("Role.class");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO user = new UserDAO();
		User user1 = new User();

		user1.isActive();
		user1.setEmailid("kavi@gmail.com");
		user1.setId(21);
		user1.setMobileno(985674320);
		user1.setName("mani");
		user1.setPassword("mani123");	
		user1.setRole("admin");
		user1.setUsername("mani K");

				//System.out.println(user.findAll());
		
		//System.out.println(user.findTotalUser());
		
		
	    user.findTotalUser();
	    user.delete(25);
	}

	}


