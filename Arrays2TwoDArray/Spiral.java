package Arrays2TwoDArray;

public class Spiral {

	public static void main(String[] args) {
int[][] arr= { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

int n=arr.length;
int m=n>0?arr[0].length:0;  //to handle 0*0 case

if(n==0 || m==0)
{
	return;
}

int top=0, bottom=n-1,left=0,right=m-1;

while(top<=bottom &&left<=right )
{
	//top row
	for(int i=left;i<=right;i++)
	{
		System.out.print(arr[top][i]+" ");
	}
	top++;
	//right col
		for(int i=top;i<=bottom;i++)
		{
			System.out.print(arr[i][right]+" ");
		}
		right--;
		
		//bottom row
		for(int i=right;i>=left;i--)
		{
			System.out.print(arr[bottom][i]+" ");
		}
		bottom--;
		
		
		for(int i=bottom;i>=top;i--) {
		System.out.print(arr[i][left]+" ");
		
		}
		left++;
}


	}

}
