package ArrayList;

import java.util.ArrayList;

public class removeConseDuplicate {

	public static void main(String[] args) {
		
		int[] arr={10,10,20,20,20,30,40,10};
		ArrayList<Integer> result=removecons(arr);
		
		for(int j=0;j<result.size();j++)
		{
			System.out.print(result.get(j)+" ");
		}
	}

	private static ArrayList<Integer> removecons(int[] arr) {
		ArrayList<Integer> res=new ArrayList<>();
		res.add(arr[0]);
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				res.add(arr[i]);
			}
		}
		return res;
	}

}
