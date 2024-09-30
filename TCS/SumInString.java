package TCS;

public class SumInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s="12345";
		int n=s.length();
//		int[] arr=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			arr[i]=s.charAt(i)-'0';
//		}
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			sum+=arr[i];
//		}
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c)) {
				sum+=c-'0';
				
			}
}
		
System.out.println(sum);
	}

}
