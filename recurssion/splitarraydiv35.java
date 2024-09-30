package recurssion;

public class splitarraydiv35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		We can use a recursive approach by keeping left sum and right sum to maintain two different groups. Left sum is for multiples of 5 and right sum is for multiples of 3 (which are not multiples of 5) and the elements which are neither divisible by 5 nor by 3 can lie in any group satisfying the equal sum rule (include them in left sum and right sum one by one).

	int arr[]= {1,4,3};
	int n=arr.length;
	if(splitarray(arr,n))
	{
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
	
	}

	private static boolean splitarray(int[] arr, int n) {
		return helper(arr,n,0,0,0);
	}

	private static boolean helper(int[] arr, int n, int s, int ls, int rs) {
		//if reached enmf
	if(s==n)
	{
		return ls==rs;
	}
	
	// if div by 5 then add to lefy
	if(arr[s]%5==0)
	{
		ls+=arr[s];
	}
	
	//if div by3, not by 5, then add torgt sum
	if(arr[s]%3==0)
	{
		rs+=arr[s];
	}
	else {
		 // Try adding in both the sub-arrays (one by one)
        // and check whether the condition satisfies
		return helper(arr,n,s+1,ls+arr[s],rs) || helper(arr,n,s+1,ls,rs+arr[s]);
	}
	//all 3 cases is mul of 3borv5
	return helper(arr,n,s+1,ls,rs);
	}

}
