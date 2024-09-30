package oop;

class calulation{
	float real, img;
	calulation(float r, float i)
	{
		real=r;
		img=i;
	}
	
	 calulation() {
		// TODO Auto-generated constructor stub
	}

	void display()
	{
		System.out.println(real+" +i "+img);
	}
	
	

	 calulation add(calulation c2) {
		
		calulation res=new calulation();
		
		res.real=real+c2.real;
		res.img=img+c2.img;
		return res;
		
		
	}
	 
	 
	 calulation sub(calulation c2) {
			
			calulation res=new calulation();
			
			res.real=real-c2.real;
			res.img=img-c2.img;
			return res;
			
			
		}
	 
	 
	 calulation mul(calulation c2) {
			
			calulation res=new calulation();
			
			res.real=(real*c2.real)-(img*c2.img);
			res.img=(real*c2.img)+(img*c2.real);
			return res;
			
			
		}
	
}

public class COMPlexNum01 {

	public static void main(String[] args) {

		calulation c1=new calulation(3,6);
		calulation c2=new calulation(7,9);
			
		
		
		c1.display();
		c2.display();
		
		calulation c3=new calulation();
		c3=c1.add(c2);
		
		c3.display();
		
		c3=c1.sub(c2);
		c3.display();
		
		c3=c1.mul(c2);
		c3.display();
		
	}

}
