package recurssion;

public class GeometricSum {

	public static void main(String[] args) {

		int k=4;
		double sum=0;
		while(k>=0)
		{
			double s=(1/(Math.pow(2, k)));
			sum+=s;
			k--;
		
		}
		System.out.println(sum);
	}

}
