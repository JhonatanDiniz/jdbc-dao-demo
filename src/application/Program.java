package application;

import java.text.ParseException;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SellerDao sellerDao = DaoFactory.createSeller();
		
		System.out.println("==========Seller Find by ID ==========");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		

	}

}
