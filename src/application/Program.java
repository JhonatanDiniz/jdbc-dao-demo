package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Vendas");
		
		Seller seller = new Seller(8, "Jhonatan", "Jhonatan@mail.com", sdf.parse("01/06/1993"), 8000.00, obj);
		
		System.out.println(seller);
		

	}

}
