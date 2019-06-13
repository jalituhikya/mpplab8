package prob2.partD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import prob2.Product;

public class ProductInfo {
	
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
		
		System.out.println("products sorted by title and then model: ");
		Collections.sort(products, (p1,p2) ->
		{
			int compareByTitle = p1.getTitle().compareTo(p2.getTitle());
			if(compareByTitle == 0) {
				if(p1.getModel() == p2.getModel()) return 0;
				else if(p1.getModel() < p2.getModel()) return -1;
				else return 1;
			} else {
				return compareByTitle;
			}
		});
		System.out.println(products);
		//same instance

	}

}
