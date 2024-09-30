package String;

public class removeconsecutiveduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sd="xxyyzxx";
String f=remcondup(sd);
System.out.println(f);

	}

	private static String remcondup(String sd) {
		String[] temp=new String[sd.length()];
		int j=0;
		
		for(int i=0;i<sd.length()-1;i++)
		{
			if(sd.charAt(i)!=sd.charAt(i+1))
			{
				temp[j]=sd.charAt(i)+"";
				j++;
			}
		}
		temp[j]=sd.charAt(sd.length()-1)+"";
		String str1="";
		for(int i=0;i<=j;i++)
		{
			str1+=temp[i];
		}
		return str1;
	}

}
