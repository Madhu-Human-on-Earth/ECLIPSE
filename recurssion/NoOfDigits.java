package recurssion;

public class NoOfDigits {

	public static void main(String[] args) {

		System.out.println(nod(789));
	}

	private static int nod(int i) {
	int c=0;
	int r=0;
		while(i>0)//78>0, 7,
		{
	//	r=i%2;// 9, 8, 
			c++;//c=1, 2
			i=i/10;//i=78,7,  
			
		}
		return c;
	}

}
