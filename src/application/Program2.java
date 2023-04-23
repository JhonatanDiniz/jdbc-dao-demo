package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartment();
		
		System.out.println("======= Find By Id =========");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n======= Find All =========");
		List<Department> listDep = departmentDao.findAll();
		for (Department obj : listDep) {
			System.out.println(obj);			
		}
		
		/*
		System.out.println("\n======= Update =========");
		dep.setName("Programação");
		departmentDao.update(dep);
		System.out.println("Updated!");
		

		System.out.println("\n======= Insert =========");
		Department newDep = new Department(null, "Compras");
		departmentDao.insert(newDep);
		System.out.println("Inserted new Id = " + newDep.getId());
		*/

	
		System.out.println("\n======= Delete =========");
		departmentDao.deleteById(4);
		System.out.println("Deleted!");

		
		

	}

}
