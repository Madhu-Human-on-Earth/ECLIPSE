package recurssion;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,3,5,7,9};
		int[] a2= {2,4,6,8};
		int[] d=new int[a1.length+a2.length];
		int[] f=merge(a1,a2,d);
		for(int K:d)
		{
			System.out.print(K+" ");
		}
		

	}

	private static int[] merge(int[] a1, int[] a2, int[] d) {
		int i=0,j=0,k=0;
		
		while(i<a1.length && j<a2.length)
		{
			if(a1[i] <= a2[j])
			{
				d[k]=a1[i];
				i++;
				k++;
			}
			else {
				d[k]=a2[j];
				j++;
				k++;
			}
		}
		
		if(i<a1.length)
		{
			while(i<a1.length)
			{
				d[k]=a1[i];
				i++;
				k++;
			}
		}
		if(j<a2.length)
		{
			while(j<a2.length)
			{
				d[k]=a2[j];
				j++;
				k++;
			}
		}
		return d;
	}

	
}
