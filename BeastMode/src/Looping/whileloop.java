package Looping;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer br=new StringBuffer();
		char c;
		System.out.println("ENTER A STRING:: ");
		
		try {
			while((c=(char)System.in.read())!='\n') {
				br.append(c);
				
			}
		}
		catch(Exception e) {
			System.out.println("ERROR IN INPUT");
		}
		
		
		System.out.println(br);

	}

}
