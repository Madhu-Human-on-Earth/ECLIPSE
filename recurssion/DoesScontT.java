package recurssion;

public class DoesScontT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="abchjsgsuohhdhyrikkkndd";
String b="coding";

System.out.println(asd(a,b));

	}

	private static boolean asd(String a, String b) {
		
		if(b.length()==0)
		{
			return true;
		}
		if(a.length()==0)
		{
			return false;
		}
		
		if(a.charAt(0)==b.charAt(0))
		{
			return asd(a.substring(1),b.substring(1));
		}
		else {
			return asd(a.substring(1),b);
		}
		
	}

}
