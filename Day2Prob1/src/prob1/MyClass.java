package prob1;

import java.util.function.Function;
import java.util.function.Predicate;

public class MyClass {
	
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public MyClass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public boolean myMethod(MyClass cl) {
		Predicate<Object> predicate  = this::equals;
		return predicate.test(cl);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
	

}
