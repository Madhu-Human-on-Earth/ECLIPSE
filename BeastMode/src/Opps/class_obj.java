package Opps;


public class class_obj {
	

	public static void main(String[] args) {
		
		int area1, area2;
		
		Rectangle rect1=new Rectangle();
		rect1.len=15;
		rect1.width=10;
		
		area1=rect1.rectArea();
		
		Rectangle rect2=new Rectangle();
		rect2.getData(20,12);
		
		area2=rect2.rectArea();
		
		System.out.println(area1);
		System.out.println(area2);
	}

}

class Rectangle{
	
	int len, width;
	
	void getData(int x, int y) {
		len=x;
		width=y;
	}
	
	
	int rectArea() {
		int area=len*width;
		return area;
	}
}
