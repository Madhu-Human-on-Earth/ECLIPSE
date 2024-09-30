import java.util.Arrays;

public class ClassPropertyTest {

	public static void main(String[] args) {
		
		Class c1=java.util.Date.class;
		System.out.println("c1 object class name:: "+c1.getClass());
		System.out.println("c1 object data :: "+ c1.toString());
		System.out.println("c1 object class (Date class implemented interfaces::"+Arrays.toString(c1.getInterfaces()));
		System.out.println("c1 object class (Date class super name classs"+c1.getSuperclass());
		System.out.println("c1 object class (Date class) super class method names::"+Arrays.toString(c1.getDeclaredMethods()));
		
	}
}
