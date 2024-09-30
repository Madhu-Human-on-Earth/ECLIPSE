
public class wgtofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World!!";
		int optionofIncludeVowels = 0;//o =not include, 1 means = include
			String s=str.toUpperCase();
			int sum=0;
			int len=str.length();
			
			for(int i=0;i<len;i++) {
				
				char letter=str.charAt(i);
				
				if(Character.isAlphabetic(letter))
				{
					if((optionofIncludeVowels==0) &&(letter=='A') ||(letter=='E')||(letter=='I')|| (letter=='O')||(letter=='U'))
					{
						sum+=0;
					}
					else {
						sum+=letter-64;
						
					}
				}
			}
		
System.out.println(sum);
	}

}
