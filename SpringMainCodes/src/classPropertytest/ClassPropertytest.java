package classPropertytest;

import java.util.Arrays;

public class ClassPropertytest {
	
public static void main(String[] args) {
	Class c1=java.util.Date.class;
	
	System.out.println("c1 object class name ::"+c1.getClass());
	System.out.println("c1 object data ::"+c1.toString());
	System.out.println("c1 object class(dateclass) implementred interfaces"+Arrays.toString(c1.getInterfaces()));
	System.out.println("c1 object class(dateclass) super class name::"+c1.getSuperclass());
	System.out.println("c1 object class(dateclass) super method names::"+Arrays.toString(c1.getDeclaredMethods()));

	



}
}
