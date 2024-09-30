package premium;

import java.util.Scanner;

public class minJump_pos_i_and_neg_i {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	
	int sol=minsteps(x);
	System.out.println(sol);
	
}

private static int minsteps(int x) {
	int sum=0;
	int jump=1;
	while(sum<x) {
		sum+=jump;
		jump++;
	}
	if((sum-x)%2==0) {
		return jump-1;
	}
	else if((sum+jump-x)%2==0) {
		return jump;
	}
	else {
		return jump+1;
	}
}
}
