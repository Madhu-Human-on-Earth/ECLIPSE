package recurssion;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {10,4,5,9,8,6,12,11,7};
		
		quicksort(a,0,a.length-1);
		for(int h:a)
		{
			System.out.print(h+" ");
		}
	}
//n logn , wc=n2
	private static void quicksort(int[] a, int low, int hi) {

		if(low>hi)
		{
			return ;
			
		}
		int s=low;
		int e=hi;
		int m=s+(e-s)/2;
		int pivot=a[m];
		
		while(s<=e)
		{
			while(a[s]<pivot)
			{
				s++;
			}
			while(a[e]>pivot)
			{
				e--;
			}
			
			if(s<=e)
			{
				int temp=a[s];
				a[s]=a[e]; 
				a[e]=temp;
				s++;
				e--;
				
			}
		}
		//now my pivot id at correct index,please sort 2 halvesnow
		//this time, s, ecomes atbsae ele  like,   1,2,3,4,5..1=>low, 5-=>high,  3, s,e
		quicksort(a, low, e);
		quicksort(a, s, hi);
	}

}
