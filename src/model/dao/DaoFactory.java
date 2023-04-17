package model.dao;

import model.dao.JDBC.SellerDaoJDBC;

public class DaoFactory {
	
	public SellerDao createSeller() {
		return new SellerDaoJDBC();
	}

}
