package recurssion;

public class Fact {

	public static void main(String[] args) {

		System.out.println(fact(5));
		//System.out.println(sumn(10));
	}  //5!=5*4*3*2*1=120

//	private static int sumn(int i) {
//		if(i==0)
//		{
//			return 0;
//		}
//		return i+sumn(i-1);
//	}

	private static int fact(int i) {
		
		if(i==0)
		{
			return 1;
		}
		else {
			return i*fact(i-1);
		}
		
	}

}
