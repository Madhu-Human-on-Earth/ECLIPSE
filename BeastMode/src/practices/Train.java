package practices;

import java.util.Date;
import java.util.Scanner;

public class Train {
	public static int Train_Number;
	public static String Train_Name;
	public static String Source;
	public static String Destination;
	public static String Journey_Date;
	public static int capacity;

	public static void main(String[] args) {
		Init();
		display();
		
		
		
	}
	
	public static void Init(){
		Scanner sc=new Scanner(System.in);
		System.out.println("TRAIN NUMBER: ");
		Train_Number=sc.nextInt();
		System.out.println("TRAIN NAME: ");
		Train_Name=sc.next();
		System.out.println("TRAIN SOURCE: ");
		Source=sc.next();
		System.out.println("TRAIN Destination: ");
		Destination=sc.next();
		System.out.println("TRAIn JOURNEY DATE: ");
		Journey_Date=sc.next();		
		System.out.println("TRAIN Capacity: ");
		capacity=sc.nextInt();
	}
	
	public static void display() {
		System.out.println("TRAIN NUMBER: "+Train_Number);
		System.out.println("TRAIN NAME: "+Train_Name);
		System.out.println("TRAIN SOURCE: "+Source);
		System.out.println("TRAIN Destination: "+Destination);
		System.out.println("TRAIn JOURNEY DATE: "+Journey_Date);
		System.out.println("TRAIN Capacity: "+capacity);




	}

}
