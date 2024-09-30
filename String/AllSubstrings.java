package String;

public class AllSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
substring(str);
	}

	private static void  substring(String str) {
		
		int n=str.length();
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i;j<n;j++)
//			{
//				for(int k=i;k<=j;k++)
//				{
//					System.out.println(str.charAt(k));
//				}
//				System.out.println();
//			}
		//O(n^2)
//		}
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}

}
