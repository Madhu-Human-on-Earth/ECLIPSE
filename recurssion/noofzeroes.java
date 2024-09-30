package recurssion;

public class noofzeroes {
//compiler issue
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=01323033;
System.out.println(count(n));
	}

	private static int count(int n) {
		
	
	if(n<10)
	{
		if(n==0)
		{
			return 1;
		}
		else {
return 0;	
}
	}

	if(n%10==0)
	{
		return count(n/10)+1;	
		}
	else {
		return count(n/10);
	}
	}
}
