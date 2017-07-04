package model;

import java.util.logging.Logger;

import dao.BookSalesDAO;

public class TestBookSales {
	public static final Logger logger = Logger.getLogger("BookSales.class");
public static void main(String[]args)
{
	BookSales cc= new BookSales();
	
	cc.setSalesid(4);
	cc.setUserid(24);
	cc.setBookid(103);
	cc.setQuantity(2);
	cc.setTotalamount(45);
	cc.setOrderdate("05-april-17");
	cc.setStatus("BOOKED");


}
}
