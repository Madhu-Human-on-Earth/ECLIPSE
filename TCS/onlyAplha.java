package TCS;

public class onlyAplha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Remove all characters other than alphabets
		
		String s="avbd+908635673hdbhdhbdc738548568+/*-";
		String res=s.replaceAll("[^a-zA-Z]","");
		System.out.println(res);

		
//		[abc]	Find one character from the options between the brackets
//		[^abc]	Find one character NOT between the brackets
//		[0-9]	Find one character from the range 0 to 9
		
		
	}

}
