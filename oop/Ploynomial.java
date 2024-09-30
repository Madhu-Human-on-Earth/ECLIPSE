package oop;

public  class Ploynomial { 
	
	
	
	//two things   1)degree, 2)co efficient 
	private int degree;
	private double[] coeffs;  //coeffs[0]=p_0,c[1]=p_1..co[degree]=p_n
	
	//constructors   : single term  a*x^n
	
	public Ploynomial(double a, int n) {
		this.degree=n;
		this.coeffs=new double[degree+1];//size of coeffs  geater than n;
	
		this.coeffs[n]=a;//p_n=a, p_n-1=0,p_n-2=0....p_1=0,p_0=0
		
		
	}
	
	//general 
	public Ploynomial(double[] coeffs)
	{
		if(coeffs==null) //creatre a const poly P(x)=0
		{
			this.degree=0;
			this.coeffs=new double[1];
		}
		else {
			this.degree=coeffs.length-1;
			this.coeffs=coeffs;
		}	
		
	}
	//var args uis same a s above
//	public Ploynomial(double...coeffs)
//	{
//		if(coeffs==null) //creatre a const poly P(x)=0
//		{
//			this.degree=0;
//			this.coeffs=new double[1];
//		}
//		else {
//			this.degree=coeffs.length-1;
//			this.coeffs=coeffs;
//		}	
//		
//	}
	
	//string represenation
	@Override
	public String toString() {
		//we wanna print p(x)=c[n]*x^n+c[n-1]*x^(n-1)+..c[1]*x+c[0]
	
	StringBuilder sb=new StringBuilder();
	
	for(int i=degree;i>0;i--)
	{
		String coeff=null;
		if(i==degree)
		{
		 coeff=String.format("%.4f",(coeffs[i]));

		}
		else
		{
			coeff=String.format("%.4f",Math.abs(coeffs[i]));

		}
		if(i==1)
			sb.append(coeff).append("(x)");
		else
		{
		sb.append(coeff).append("(x^)").append(i);	
	}
		sb.append(getSign(coeffs[i-1]));
	}
	
	
	String coeff=String.format("%.4f", Math.abs(coeffs[0]));
	//sb.append("+");
	sb.append(coeff);
	return sb.toString();
	}
	
	private String getSign(double x)
	{
		if(x>=0)
		{
			return " + ";
		}
		else
		{
			return " - ";
		}
	}
	
	/************/
	//evaluation : horners method:-->this is most eff mtd to evaluate on poly :0(n)
	public double evaluate(double x)
	{
		double value=coeffs[degree];//b_n=a_n
		for(int i=degree;i>0;i--)
		{
			value=coeffs[i-1]+x*value;//b_n-1= a_n-1+b_n*x0..b0=a0+b1*x0
		
		}
		return value;
	}
	//composite of polynomial  p9q(x))
	
	
	public Ploynomial composiiton(Ploynomial q)
	{
		return null;
	}
	private Ploynomial plus(double v)
	{
		double[] coeffsum=new double[degree+1];
		for(int i=0;i<=degree;i++)
		{
			coeffsum[i]=coeffs[i];
		}
		coeffsum[0]+=v;
		return new Ploynomial(coeffsum);
	}
	
private Ploynomial plus(Ploynomial q)
{
	int m=Math.max(this.degree,q.degree);
			double[] coeffsSum=new double[m+1];
			for(int i=0;i<=m;i++)
			{
				if(i>q.degree && i<=this.degree)
				{
					coeffsSum[i]=this.coeffs[i];
				}
				else if(i>this.degree && i<=q.degree)
				{
					coeffsSum[i]=q.coeffs[i];
				}
				else {
					coeffsSum[i]=this.coeffs[i]+q.coeffs[i];
				}
				
			}
			return new Ploynomial(coeffsSum);
	
}


//operator overloading 

public Ploynomial add(double v)
{
	return this.plus(v);
}
public Ploynomial addRev(double v)
{
	return this.plus(v);
}
	
public Ploynomial add(Ploynomial v)
{
	return this.plus(v);
}
public Ploynomial addRev(Ploynomial v)
{
	return this.plus(v);
}

}
