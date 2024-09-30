package premium;
//Sieve of Eratosthenes Method
import java.util.Arrays;
//O(n*log(log(n)))
//o(n)
public class Prime_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=1;
		int e=10;
		
		sieveOfEratosthenes(s,e);

	}

	private static void sieveOfEratosthenes(int s, int e) {
		
		boolean[] prime=new boolean[e+1];
		Arrays.fill(prime, true);
	prime[0]=false;
	prime[1]=false;
		for(int i=2;i*i<=e;i++) {
			if(prime[i]==true) {
				for(int j=i+i;j<=e;j+=i) {
					prime[j]=false;
				}
			}
		}
		
		for(int i=s;i<=e;i++) {
			if(prime[i]) {
				System.out.print(i+" ");
			}
		}
	
	}
	

}
