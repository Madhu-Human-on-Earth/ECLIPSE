package Looping;

public class power_n {
	
	public static void main(String[] args) {
		long p;
		int n;
		double q;
		
		System.out.println("2 to power of n:");
		p=1;
		
		for(n=0;n<10;++n) {
			if(n==0) {
				p=1;
			}
			else {
				p=p*2;
				
			}
		q=1.0/(double)p;
		System.out.println("    "+q+"      "+n+"    "+p );
		}
	}

}
