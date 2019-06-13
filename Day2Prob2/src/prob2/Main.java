package prob2;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> supplier = Math::random;
		System.out.println("Part i Random number 1: " + supplier.get());

		Supplier<Double> supplier1 = () -> Math.random();
		System.out.println("Part ii Random number 2: " + supplier1.get());

		class SupplierImpl implements Supplier<Double> {

			@Override
			public Double get() {
				// TODO Auto-generated method stub
				return Math.random();
			}
		}
		SupplierImpl supplier3 = new SupplierImpl();

		System.out.println("Part iii Random number 3: " + supplier3.get());

	}

}
