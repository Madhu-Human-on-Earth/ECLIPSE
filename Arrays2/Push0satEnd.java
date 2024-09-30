package Arrays2;

public class Push0satEnd {
public static void main(String[] args) {
	int [] arr= {0,3,0,2,0};
	int i=0,j=0;
	for(;i<arr.length;i++)
	{
		if(arr[i]!=0)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
	}
	
	for(int k=0;k<arr.length;k++)
	{
		System.out.print(arr[k]+" ");
	}
}
}
