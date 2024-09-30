package recurssion;

public class LastIndex {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,5,3,2,1,7,5,4,3,5,33,24,32};
		int target=1;
		for(int i=arr.length-1;i>=0;i--)
		{
		
			if(arr[i]==target) {
				System.out.println(i);
				System.exit(i);
			}
		}
	}

}
