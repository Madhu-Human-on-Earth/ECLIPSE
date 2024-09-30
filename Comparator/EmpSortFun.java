package Comparator;
import java.util.*;
import java.util.Collections;
public class EmpSortFun { 
	
public static void main(String[] args) {
		
	ArrayList<EmployeesSort> emp=new ArrayList<>();
	  
	emp.add(new EmployeesSort("Madhu", "12345", 9));
	emp.add(new EmployeesSort("ABCD", "98764", 3));
	emp.add(new EmployeesSort("ANGDH", "1000", 2));
	
	System.out.println(emp);
	
	Collections.sort(emp,new id_Comparator());
	System.out.println(emp);
	
	
	ArrayList<EmployeesSort> emp1=new ArrayList<>(emp);
	  
	Collections.sort(emp1,new NameComparator());

	System.out.println(emp1);
	//Comparable, here we use only one logic 
	
	}



}
