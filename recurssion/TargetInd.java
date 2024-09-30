package recurssion;

public class TargetInd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,5,4,5,4,4565,645,6,45,654,6,45,6,45,547};
		int tar=547;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==tar)
			{
				System.out.println(i);
			}
		}
		System.out.println(arr.length-1);

	}

}
