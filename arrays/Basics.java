package arrays;

import java.util.Arrays;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,3,2,1,4,5};
		
		int len=arr.length;
		//System.out.println(len);
		
		Arrays.sort(arr);//  1,2,3,4,5,6       1-->[0],2-->[1],3,4,5,6[lem-1]
		
	for(int i=0;i<len;i++)//0<5,,1<5,,5<5
	{
		System.out.println(arr[i]);//arr[0]
	}
	
	

	}

}
