package premium;

public class Even_Odd_Pos {

	public static void main(String[] args) {
		
		int[] arr= {9,3,8,7,6,2,3};
	SortByParity(arr);
	
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}

	}

	private static void SortByParity(int[] arr) {
		int i=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i]%2==0) {
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				i++;
				j++;
				
			}
			else {
				//odd
				i++;
			}
		}
		
	}

}
