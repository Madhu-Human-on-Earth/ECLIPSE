
public class palindrome {
public static void main(String[] args) {
	String s="madam";
	String f=s.toUpperCase();
	String a="";
	for(int i=f.length()-1;i>=0;i--)
	{
		a+=f.charAt(i);
	}
	
	if(f.equals(a))
	{
	System.out.println("Palindrone");
	}
	else {
		System.out.println("No");
	}
}
}
