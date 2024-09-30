package recurssion;

public class starbw2condup {

	public static void main(String[] args) {

		String s="hello";
		System.out.println(sde(s));
	}

	private static String sde(String s) {
		// 
		if(s.length()<=1)
		{
			return s;
		}
		
		String f=sde(s.substring(1));
		if(s.charAt(0)==s.charAt(1))
		{
			return s.charAt(0)+"*"+s.charAt(1)+f.substring(1);
		}
		else
		{
			return s.charAt(0)+f;
		}
	}

}
