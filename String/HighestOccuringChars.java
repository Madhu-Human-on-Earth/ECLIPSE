package String;

public class HighestOccuringChars {

	public static void main(String[] args) {

		String s="hello world";
		
		System.out.println(highocc(s));
	}

	private static char highocc(String s) {
		
		int[] arr=new int[256];
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]++;
			
		}
		char c='\0';
		int max=0;
		for(int i=0;i<256;i++)
		{
			if((arr[i]> max)) {
				c=(char)i;
				max=arr[i];
			}
		}
		return c;
	}

}
