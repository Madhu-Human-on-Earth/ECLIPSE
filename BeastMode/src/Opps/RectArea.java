package Opps;

public class RectArea {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1=new Rect(12,28);
		int area1=r1.area();
		System.out.println(area1);
		Rect r2=new Rect(10,99);
		int area2=r2.area();
		System.out.println(area2);
		

	}

}


class Rect{
	int len, width;
	
	Rect(int x, int y){
		x=len;
		y=width;
	}
	
	int area() {
		return len*width;
	}
	
}
