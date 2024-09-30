package String;

public class ReverseWordWise {

	public static void main(String[] args) {
	//	Welcome to Coding Ninjas

		String str="Welcome to coding platform";
	String sol= revword(str);
			System.out.println(sol);
	
	}

	private static String revword(String str) {
		
		String[] words=str.split(" ");
		String s="";
		for(int i=words.length-1;i>=0;i--)
		{
			s+=words[i]+" ";
		}
		return s;
		
	}

}
