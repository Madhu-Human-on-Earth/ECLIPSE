package InterviewPrep;

import java.util.HashSet;

public class FirstDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2, 4, 3, 5, 1};
System.out.println(solution(a));
	}

	private static int solution(int[]a) {
		HashSet<Integer> ch=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			if(ch.contains(num))
			{
				return num;
			}
			ch.add(num);
			
		}
		return -1;
		
	}

}


//For a = [2, 1, 3, 5, 3, 2], 
//the output should be solution(a) = 3.
//There are 2 duplicates:
//numbers 2 and 3. 
//The second occurrence of 3 has a 
//smaller index than the second occurrence of 2 does,
//so the answer is 3.