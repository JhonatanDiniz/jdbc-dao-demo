package application;

import java.text.ParseException;
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
		System.out.println();

		System.out.println("==========Seller Find by Department Id ==========");
		Department dep = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartmentId(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("==========Seller Find by All ==========");
		List<Seller> listAll = sellerDao.findAll();
		for (Seller obj : listAll) {
			System.out.println(obj);
			
		}
		

	}

}
