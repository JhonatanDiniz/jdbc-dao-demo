package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {

		SellerDao sellerDao = DaoFactory.createSeller();

		System.out.println("==========Seller Find by ID ==========");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);


		System.out.println("\n==========Seller Find by Department Id ==========");
		Department dep = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartmentId(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		

		System.out.println("\n==========Seller Find by All ==========");
		List<Seller> listAll = sellerDao.findAll();
		for (Seller obj : listAll) {
			System.out.println(obj);			
		}
		
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("\n==========Seller Insert ==========");
		seller = new Seller(null, "JhonJhon", "jhonjhon@mail.com", sdf.parse("01/06/1993") , 8500.00, dep);
		sellerDao.insert(seller);
		System.out.println("Created! New id = " + seller.getId());
		*/	
		
		/*
		System.out.println("\n==========Seller Update ==========");
		seller = sellerDao.findById(4);
		seller.setDepartment(dep);
		sellerDao.update(seller);
		System.out.println("Updated!");
		*/
		
		
		System.out.println("\n==========Seller Delete ==========");
		sellerDao.deletById(4);
		System.out.println("Deleted!");
		
		

	}

}
