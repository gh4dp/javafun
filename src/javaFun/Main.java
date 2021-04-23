package javaFun;

import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products = ExampleData.getProducts();
		

		
		for (Product p: products) {
			System.out.println(p);
		}
		
		
	}

}
