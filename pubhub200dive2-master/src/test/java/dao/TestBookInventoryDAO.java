package dao;

import java.util.logging.Logger;

import model.BookInventory;

public class TestBookInventoryDAO {
	public static final Logger logger = Logger.getLogger("BookInventory.class");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BookInventoryDAO books = new BookInventoryDAO();
BookInventory booki = new BookInventory();

booki.setBookid(103);
booki.setQuantity(3);

		
		//System.out.println(books.findAll());
		
		//System.out.println(books.findTotalBookInventory());
		
		
		
		
		
		
	    books.findTotalBookInventory();
	    books.delete(25);
	}
	

	}


