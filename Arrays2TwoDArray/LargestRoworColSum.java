package Arrays2TwoDArray;

public class LargestRoworColSum {

	public static void main(String[] args) {
		
		int[][] arr= {};
		int gr=0,gc=0;int no=0;
		String f = "";
		if(arr.length==0)
		{
			System.out.println(Integer.MIN_VALUE);
		}
		//largest row sum
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[0].length;j++)
			{
				sum+=arr[i][j];
			}
			if(sum > gr)
			{
				gr=sum;
				no=i;
				f="row";
			}
		}
		
		
		
	//largest col sum
		
		for(int i=0;i<arr[0].length;i++)
		{
			int sum=0;
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[j][i];
			}
			if(sum > gc)
			{
				gc=sum;
				no=i;
				f="col";
			}
		}
		if(gc>gr)
		{
			System.out.println(f+ " " +no+" "+gc);
			
		}
		else {
			System.out.println(f+" "+no+" "+gr);
		}
	
	}

}
