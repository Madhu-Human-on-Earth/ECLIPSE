package recurssion;

public class CalcPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(power(3,5));
	}

	private static int power(int i, int j) {
		
		if(j==0)
		{
			return 1;
		}
		
		return i*power(i,j-1);
		
	}

}
