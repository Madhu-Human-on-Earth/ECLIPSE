package Opps;

public class default_const { 
	
	public static void main(String[] args) {
		Perimeter p1=new Perimeter();
		Perimeter p2=new Perimeter(23,22);
		
		p1.cal();
		p2.cal();
		
	    
		
	}

}



class Perimeter{
	int length;
	int breadth;
	
	Perimeter(){
		length=0;
		breadth=0;
		
	}
	Perimeter(int x, int y){
		length=x;
		breadth=y;
	}
	
	void cal() {
	
		int peri;
		peri=2*(length+breadth);
		System.out.println(peri);
		
	}
	
	
	
	
}
