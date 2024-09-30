package String;
/**
 * 
 */

/**
 * @author madhu
 *
 */
final class ReplaceChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(replaceChars("abcxdxex",'x','y'));

	}

	private static String replaceChars(String string, char c, char d) {
		// TODO Auto-generated method stub
		if(string.length()==0) {
			return string;
		}
		String sde=replaceChars(string.substring(1), c, d);
		if(string.charAt(0)==c)
		{
			return d+sde;
		} 
		else {
			return string.charAt(0)+sde;
		}
	}

}
