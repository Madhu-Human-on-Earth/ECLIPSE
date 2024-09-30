package String;

public class ReplacePI {

	public static void main(String[] args) {
System.out.println(replPi("apibpicpidpi"));

	}

	private static String replPi(String string) {

if(string.length()<=1)
{
	return string;
}

String sde=replPi(string.substring(2));
if(string.charAt(0)=='p' && string.charAt(1)=='i') {
	//String sde=replPi(string.substring(2));
	return "3.14"+sde;
	
}
else {
sde=replPi(string.substring(1));
	return string.charAt(0)+sde;
}

	}

}
