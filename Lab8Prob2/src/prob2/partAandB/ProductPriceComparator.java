package prob2.partAandB;

import java.util.Comparator;

import prob2.Product;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getPrice() > o2.getPrice()) {
			return 1;
		}else if(o1.getPrice() == o2.getPrice()) {
			return 0;
		}else {
			return -1;
		}
	}

}
