package Opps;

public class staticc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float A=Mathoperation.mult(4.0f,5.0f);
		float b=Mathoperation.div(A, 2.0f);
		
		System.out.println(A+"-=-->"+b);
		

	}

}

class Mathoperation{
	static float mult(float x, float y) {
		return x*y;
	}
	static float div(float x, float y) {
		return x/y;
	}
}
