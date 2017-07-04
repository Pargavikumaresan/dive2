package model;

import java.util.logging.Logger;

import dao.UserDAO;

public class TestUser {
	public static final Logger logger = Logger.getLogger("User.class");
public static void main(String[]args)
{
User cc= new User();
	
	cc.setId(35);
	cc.setName("Thenmozhi");
	cc.setUsername("Thenmozhi");
	cc.setPassword("abcd");
	cc.setMobileno(987654231);
	cc.setEmailid("then@gmail.com");
    cc.isActive();
	cc.setRole("Author");
   


}


}
