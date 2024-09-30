
public class soindleavingevery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inp=582109;
		String str=Integer.toString(inp);
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				int res=Character.getNumericValue(str.charAt(j));
				sum+=res;
			}
		}
		System.out.println(sum);
		
//		String str=""+inp;
//		int sum=0;
//		int len=str.length();
//		
//		int[] arr=new int[len];
//		
//		for(int i=0;i<len;i++)
//		{
//			arr[i]=inp%10;
//			inp/=10;
//		}
//		
//		for(int i=len-1;i>=0;i--)
//		{
//			for(int j=i;j>=0;j--)
//			{
//			sum+=arr[j];
//			}
//		}
//		System.out.println(sum);
//
		}
}
