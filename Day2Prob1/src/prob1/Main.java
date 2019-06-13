package prob1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass obj1 = new MyClass(1, 2);
		MyClass obj2 = new MyClass(2, 3);
		MyClass obj3  = new MyClass(1, 2);
		
	   System.out.println(obj1.myMethod(obj2));
		System.out.println(obj1.myMethod(obj3));
	}

}
