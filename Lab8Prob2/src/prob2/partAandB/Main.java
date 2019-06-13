package prob2.partAandB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import prob2.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Shoes", 100.0, 1));
		products.add(new Product("Car", 30000.0, 4));
		products.add(new Product("Table", 1000.0, 2));
		products.add(new Product("Shoes", 150.0, 3));
		products.add(new Product("Laptop", 550.0, 10));
		System.out.println("products unsorted: ");
		System.out.println(products);
		System.out.println();
		
		Collections.sort(products,new ProductPriceComparator());
		System.out.println("products sorted by price: ");
		System.out.println(products);
		System.out.println();
		
		Collections.sort(products,new ProductTitleComparator());
		System.out.println("products sorted by title: ");
		System.out.println(products);

	}

}
