package model.dao;

import db.DB;
import model.dao.JDBC.DepartmentDaoJDBC;
import model.dao.JDBC.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSeller() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartment() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
