package String;

public class Count_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String string = "Coding Ninjas!";
int x=count( string);
System.out.println(x);
	}

	private static int count(String string) {
		// TODO Auto-generated method stub
		if(string.length()-1==-1)
		{
			return 0;
		}
		int c=0;
		for(int i=0;i<string.length()-1;i++)
		{
			if(string.charAt(i)==' ')
			{
				c++;
			}
		}
		return c+1;
	}

}
