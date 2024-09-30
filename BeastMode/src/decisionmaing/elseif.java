package decisionmaing;

public class elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rno= {111,222,333,444};
		int marks[]= {81,75,43,58};
		
		for(int i=0;i<rno.length;i++) {
			if(marks[i]>79) {
				System.out.println(rno[i]+" Honors");
			}
			else if (marks[i]>59) {
				System.out.println(rno[i] +" I Division");
			}
			else if (marks[i]>49) {
				System.out.println(rno[i]+" II Division");
			}
			else {
				System.out.println(rno[i]+" FAIL");
			}
		
		}

	}

}
