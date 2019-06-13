package prob2.partC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import prob2.Product;

public class ProductInfo {
	static enum SortMethod {
		BYPRICE, BYTITLE
	};

	SortMethod method;

	public void sort(List<Product> products, final SortMethod method) {
		class ProductComparator implements Comparator<Product> {
			@Override
			public int compare(Product p1, Product p2) {
				if (method == SortMethod.BYTITLE) {
					return p1.getTitle().compareTo(p2.getTitle());
				} else {
					if (p1.getPrice() == p2.getPrice())
						return 0;
					else if (p1.getPrice() < p2.getPrice())
						return -1;
					else
						return 1;
				}
			}

		}
		Collections.sort(products, new ProductComparator());
	}

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

		ProductInfo info = new ProductInfo();
		info.sort(products, SortMethod.BYPRICE);
		System.out.println("products sorted by price: ");
		System.out.println(products);
		System.out.println();

		info.sort(products, SortMethod.BYTITLE);
		System.out.println("products sorted by title: ");
		System.out.println(products);

	}

}
