package recurssion;

public class CheckNumberInaANaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {9,8,10};
int target=2;

for(int i=0;i<arr.length;i++)
{
	if(arr[i]==target)
	{
		System.out.println(true);
		System.exit(i);
	}

}
System.out.println(false);
	}

}
