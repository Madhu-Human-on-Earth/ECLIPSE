package recurssions;
import java.util.*;
public class NtoOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		solve(n);

	}

	public static void solve(int n) {
		if(n<=0) {
			return;
		}
		
		System.out.println(n);
		solve(n-1);
		
	}
}
