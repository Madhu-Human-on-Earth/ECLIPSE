package practices;

public class replace_string {
	
	private static void replacedone(String str) {
		String[] arr=str.split(" ");
		
	StringBuilder sb=new StringBuilder();
	
	for(String i:arr) {
		if(i.equals("Computer")) {
			sb.append("Information Technology");
		}
		else {
			sb.append(i);
		}
		sb.append(" ");
	}
	
	System.out.println(sb.toString().trim());//trim any training spaces
	
			
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Diploma in Computer Engineering";
		String mod=str.replace("Computer", "Information Technology");
		System.out.println(mod);
		replacedone(str);
	
	}

	
}


