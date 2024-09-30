package oop;

public class TestPolynomial {
	public static void main(String[] args) {
		
		double[] coeffs= {-1,-2/3.0,-1/2.0,-3.1,-4.2};
		//p(x)=a0+a1*x+a2*x^2+a3*x^3+...an*x^n
Ploynomial p1=new Ploynomial(coeffs);
		//Ploynomial p1=new Ploynomial( new double[] {-1,-2/3.0,-1/2.0,-3.1,-4.2});
//=a0+x(a1+x(a2+x(x(a3+...+x((a_n-1+x*a_an)..)))
		System.out.println(p1);
		Ploynomial p2=new Ploynomial(-1,-1);

		
		//Ploynomial p2=new Ploynomial( new double[] {0,0,0,1});
System.out.println(p2);
System.out.println(p2.evaluate(2));

//Ploynomial p3=p2+2;
//System.out.println(p3);
	}

}
