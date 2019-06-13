package prob2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> supplier = Math::random;
		System.out.println("Random number 1: " + supplier.supply());

		Supplier<Double> supplier1 = () -> Math.random();
		System.out.println("Random number 2: " + supplier1.supply());

		class SupplierImpl implements Supplier<Double> {

			@Override
			public Double supply() {
				// TODO Auto-generated method stub
				return Math.random();
			}
		}
		SupplierImpl supplier3 = new SupplierImpl();

		System.out.println("Random number 3: " + supplier3.supply());

	}

}
