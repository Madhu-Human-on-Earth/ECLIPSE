package Opps;

public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s1=new Sub(100,200);
		s1.display();
		

	}

}

class Super{
	int x;
	Super(int x){
		this.x=x;
	}
	
	void display() {
		System.out.println("Super x ="+x);
	}
}

class Sub extends Super{
	int y;
	Sub(int x,int y){
		super(x);
		this.y=y;
	}
	
	void display() {
		System.out.println("Super x= "+x);
		System.out.println("Sub y= "+y);
	}
}
