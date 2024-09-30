package recurssion;

public class BinarySearch {

	public static void main(String[] args) {
int [] a= {1,2,3,4,5,6};
System.out.println(bs(a,0,a.length-1,9));

	}

	private static int bs(int[] a, int i, int j, int k) {
		
		if(i>j)
		{
			return -1;
		}
		int mid=i+(j-i)/2;
		if(a[mid]==k)
		{
			return mid;
		}
		else if(a[mid]>k)
		{
			return bs(a, i,mid-1,k);
		}
		else {
			return bs(a,mid+1,j,k);
		}
	}

}
