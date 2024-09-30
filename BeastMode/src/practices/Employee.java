package practices;

import java.util.Scanner;

 class Employees {
	
	
	
	String empName;
	int empid;
	
	public void getData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp name:");
		empName=sc.nextLine();
		
		System.out.println("Enter emp id:");
		empid=sc.nextInt();
		
	}
	
	//display data
	public void putData() {
		
		System.out.println("EMPNAME: "+empName);
		System.out.println("EMP_ID:"+empid);
		
	}
	
	
	
	
	
	

}




class Salary extends Employees{
	private double basicPay, hra,da,cla,totalSalary;
	//mtd to get salary deta
	
	public void getData() {
		super.getData();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER BASIC PAY: ");
		basicPay=sc.nextDouble();
		System.out.println("ENTER HRA: ");
		hra=sc.nextDouble();
		System.out.println("ENTER DA: ");
		da=sc.nextDouble();
		System.out.println("ENTER CLA: ");
		cla=sc.nextDouble();
		
		
	}
	
	//SALARY METHOD
	public void calculateSalary() {
		totalSalary=basicPay+hra+da+cla;
		
	}
	
	//mtd to display salary
	
	public void putData() {
		super.putData();
		System.out.println("BASIC PAY: "+basicPay);
		System.out.println("HRA PAY: "+hra);
		System.out.println("DA PAY: "+da);
		System.out.println("CLA PAY: "+cla);
		System.out.println("TOTAL  PAY: "+totalSalary);




		
	}
	
}

public class Employee{
	public static void main(String[] args) {
		Salary sal=new Salary();
		sal.getData();
		sal.calculateSalary();
		sal.putData();
	}
}


