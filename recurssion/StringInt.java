package recurssion;

public class StringInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String f="1231";
System.out.println(sint(f));
	}

	private static int  sint(String f) {


		
		if(f.length()==0)
		{
			return 0;
		}
		return ((f.charAt(0)-'0')*((int)Math.pow(10, f.length()-1)))+sint(f.substring(1));
		
	}

}
