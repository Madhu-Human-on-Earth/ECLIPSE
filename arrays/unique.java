package arrays;

import java.util.Scanner;
//UNIQUE ELEMENT
public class unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int[] arr= {2,4,7,2,7};
System.out.println(duplicate(arr));
	}

	private static int duplicate(int[] arr) {
		// TODO Auto-generated method stub
		int res=0;
		for(int i=0;i<arr.length;i++)
		{
			 res=res^arr[i];
		}
		return res;
	}

}
