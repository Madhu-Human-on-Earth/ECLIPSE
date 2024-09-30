package Arrays2TwoDArray;
//Algorithm
//Given an array arr of size n.
//Create a variable named maximum and initialize it with 0.
//Run a loop from i=n-1 to i=0
//If at any point arr[i] is greater than maximum, 
//then print arr[i], and update the maximum by doing maximum=arr[i]
public class LeadersInArray {
	public static void main(String[] args) {
		int[] arr= {2,4,6,3,1,2};
		int n=arr.length;
//o(n),o(1)
		
		int i,maximum=0;
		
		for(i=n-1;i>=0;i--)
		{
			if(arr[i] > maximum)
			{
		System.out.println(arr[i]);	
		maximum=arr[i];
			}
		}
	}
	

}

//  using stack 
//int i;
//Stack<Integer> s = new Stack<Integer>();
//s.push(arr[n-1]);          // push the rightmost element into the stack which is always a leader
//for(i=n-2;i>=0;i--){
//    if(arr[i]>s.peek())    // it means arr[i] is a leader because it
//        s.push(arr[i]);    // is greater than the topmost element of the stack
//}
//while(!s.empty()){
//    System.out.print(s.peek()+" "); // printing all leaders
//    s.pop();
//}