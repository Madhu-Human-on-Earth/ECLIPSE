package Arrays2TwoDArray;

public class Total_Sum_on_the_Boundaries_and_Diagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};

//top and bottom sum

int N=arr.length;
int sum=0;
if(N-1==-1)
{
	System.out.println(Integer.MIN_VALUE);
	System.exit(0);
}
for(int i=0;i<N;i++)
{
	sum+=arr[0][i];
sum+=arr[N-1][i];

	}

//left & right diagonl sum

for(int i=1;i<N-1;i++)
{
	sum+=arr[i][i];
	sum+=arr[i][N-1-i];
}

//left sum & right sum

for(int i=1;i<N-1;i++)
{
	sum+=arr[i][0];
	sum+=arr[i][N-1];
	
}

//if array length is odd..... 
if(N%2!=0)
{
	sum-=arr[N/2][N/2];
}
System.out.println(sum);

}
}
