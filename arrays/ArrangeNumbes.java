package arrays;
//Sample Input 1 :
//1
//6
//Sample Output 1 :
//1 3 5 6 4 2
public class ArrangeNumbes {

	public static void main(String[] args) {
		int n=6;
		int[] arr=new int[n];
		 arrange(arr,n);
		
		
	}

	private static void arrange(int[] arr, int n) {

		  int start=0;
          int end = arr.length-1;
          int var=1;
          while(start<end){
              arr[start]=var;
              var++;
              arr[end]=var;
              var++;
              start++;
              end--;
          }
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
