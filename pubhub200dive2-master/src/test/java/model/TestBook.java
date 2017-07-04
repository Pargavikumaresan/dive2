package model;

import java.util.logging.Logger;

import model.Book;

public class TestBook {
	public static final Logger logger = Logger.getLogger("Book.class");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
		
		Book cc= new Book();
		
		cc.setIsbn(21);
		cc.setAuthor("kavi");
		cc.setContent("Exception");
		cc.setTitle("Java");
		cc.setPublishdate("04-mar-2017");
		cc.setStatus("DRAFT");
		
	
	}


	}


