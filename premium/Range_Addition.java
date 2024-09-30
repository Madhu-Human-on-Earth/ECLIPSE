package premium;

import java.util.Scanner;

public class Range_Addition {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int len=sc.nextInt();
	int nq=sc.nextInt();
	int[][] q=new int[nq][3];
	
	for(int i=0;i<nq;i++) {
		q[i][0]=sc.nextInt();
		q[i][1]=sc.nextInt();
		q[i][2]=sc.nextInt();
	}
	
	int[] res=Sol(len,q);
	for(int i=0;i<res.length;i++) {
		System.out.println(res[i]);
	}
	}

	private static int[] Sol(int len, int[][] q) {
		int[] res=new int[len];
		
		for(int i=0;i<q.length;i++) {
			int st= q[i][0];
			int en=q[i][1];
			int inc=q[i][2];
			
			res[st]+=inc;
			
			if(en+1<len) {
				res[en+1]-=inc;
			}
			
		}
		
		int sum=0;
		for(int i=0;i<len;i++) {
			sum+=res[i];
			res[i]=sum;
		}
		return res;
	}
}
