package Looping;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 		
//		for(int i=1;i<=5;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print(i);
//			}
//			
//			System.out.println();
//		}
		
	
//		for(int i=1;i<=5;i++) {          
//			
//			for(int j=1;j<=5;j++) {
//				
//				if(i>j) {
//System.out.print(" ");					
//				}
//				
//				else {
//					System.out.print("$");
//				}
//			}
//			
//			System.out.println();
//		}
		int a=1;
		for(int i=5;i>=1;i--){
			
				for(int j=1;j<=5;j++) {
					
					if(i>j) {
						System.out.print(" ");
					}
					else {
						System.out.print(a);
						
					}
				}
				a++;
				System.out.println();
					
				}

	}

}
