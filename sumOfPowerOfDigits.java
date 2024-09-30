
public class sumOfPowerOfDigits {

	public static void main(String[] args) {
		int a=582109;
		String str=Integer.toString(a);
		
		double res=0.0;
		
		for(int i=0;i<str.length()-1;i++)
		{
			int a1=Character.getNumericValue(str.charAt(i));
			int a2=Character.getNumericValue(str.charAt(i+1));
			res+=(int)Math.pow(a1, a2);
			
		}
		System.out.println((int)res+1);

	}

}
