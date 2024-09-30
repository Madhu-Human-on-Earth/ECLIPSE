package recurssions;
import java.util.*;
public class OneTOn {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	solve(n);
	}
	
	public static void solve(int n) {
		if(n==1) {
			System.out.println(n);
			return ;
			
		}
		
		solve(n-1);
		System.out.println(n);
	}

}
