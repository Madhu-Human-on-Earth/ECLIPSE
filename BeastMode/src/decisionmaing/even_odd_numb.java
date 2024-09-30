package decisionmaing;

public class even_odd_numb {
	
	public static void main(String[] args) {
		int[] numbers= {50,65,56,71,81};
		
		int even=0,odd=0;
		 
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] % 2==0) {
				System.out.println("EVEN:"+numbers[i]);
				even+=1;
			}
			else {
				System.out.println("ODD:"+ numbers[i]);
				odd+=1;
			}
		}
		
		System.out.println("even: "+even+ "ODD:"+odd);
		
	}

}
