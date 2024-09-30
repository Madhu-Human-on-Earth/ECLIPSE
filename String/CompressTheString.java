package String;

public class CompressTheString {

	
	
	public static void main(String[] args) {
		String s="aaabbccdsa";
		
		System.out.println(compress(s));
	
	}

	private static String compress(String s) {
		int n=s.length();
		
		

		String f="";

			for(int i=0;i<n;i++)
			{
				int count=1;
		while(i<n-1 && s.charAt(i)==s.charAt(i+1))
		{
			count++;
			i++;
		}
		f+=s.charAt(i);

		if(count>1)
		{
			f+=count;
		}


			}
			
		return f;
			
	}
}

