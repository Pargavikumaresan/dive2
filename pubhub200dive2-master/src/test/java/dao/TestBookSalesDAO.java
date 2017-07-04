package dao;

import java.util.logging.Logger;

import model.BookRatings;
import model.BookSales;

public class TestBookSalesDAO {
	public static final Logger logger = Logger.getLogger("BookSales.class");
	public static void main(String[]args)
	{
	
BookSalesDAO books = new BookSalesDAO();

BookSales book = new BookSales();

book.setBookid(103);
book.setOrderdate("2-jun-17");
book.setQuantity(3);
book.setSalesid(3);
book.setStatus("published");
book.setTotalamount(190);
book.setUserid(21);
		
		//System.out.println(books.findAll());
		
		//System.out.println(books.findTotalBookSales());

books.findTotalBookSales();
books.delete(25);
}
}