package prob3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		System.out.println("part i");
		fruits.forEach((x)->System.out.println(x));
		
		System.out.println("\npart ii");
		fruits.forEach(System.out::println);

	}

}
