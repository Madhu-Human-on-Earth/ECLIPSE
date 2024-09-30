//package Opps;
//
//public class varargs {
//	
//	varargs(String... person) {
//		 for(String name:person) {
//			 System.out.println("Hello "+name);
//		 }
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		new varargs("MADHU","KATR","WERGVB");
//		
//
//	}
//
//}

//MTD-2

package Opps;

public class varargs {
	
  public static void	varargs(String... person) {
		 for(String name:person) {
			 System.out.println("Hello "+name);
		 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		varargs("MADHU","KATR","WERGVB");
		

	}

}




//static mtds vs instance mtds and constr:
//	
//	instance methods and constructors->
//These belong to an instance of a class. to use them, you must first create an object of that class using new.
//
//static Methods: ->
//These belongs to the class itself, not to any particular object. you can call static methods without creating an instance.
//
//if your intension is to call a method creating an object, you should define the method as static



