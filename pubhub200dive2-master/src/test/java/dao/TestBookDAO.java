package dao;

import java.util.logging.Logger;

import model.Book;

public class TestBookDAO {
	public static final Logger logger = Logger.getLogger("Book.class");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO book = new BookDAO();
		
		//System.out.println(book.findAll());
		
		//System.out.println(book.findTotalBook());
		
		Book book1 = new Book();

		book1.setIsbn(103);
		book1.setTitle("Java");
		book1.setAuthor("gfsd");
		book1.setPublishdate("14-mar-17");
		book1.setContent("hiwehfybhceb");
		book1.setPrice(450f);	
		book1.setStatus("draft");


		
	book.findTotalBook();
	book.delete(25);
	}


	}


