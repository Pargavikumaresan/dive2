package dao;

import java.util.logging.Logger;

import model.BookRatings;
import model.Role;

public class TestRoleDAO {
	public static final Logger logger = Logger.getLogger("Role.class");
	public static void main(String[]args)
	{
	
RoleDAO role = new RoleDAO();

Role role1 = new Role();

role1.setId(103);
role1.setName("admin");

		
		//System.out.println(role.findAll());
		
		//System.out.println(role.findTotalRole());
	
		role.findTotalRole();
	    role.delete(25);
}

}



