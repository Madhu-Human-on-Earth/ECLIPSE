package Opps;

public class Single_Inher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BedRoom room1=new BedRoom(14,12,10);
		int area1=room1.area();
		int volume1=room1.volume();
		
		System.out.println("Area 1:: "+area1);
		System.out.println("Volume 1:: "+volume1);

	}

}
class Roomer{
	int l;
	int b;
	
	Roomer(int x, int y){
		l=x;
		b=y;
	}
	int area() {
		return l*b;
	}
}
 
class BedRoom extends Roomer{
	int height;
	BedRoom(int x, int y, int z){
		super(x,y);
		height=z;
		
	}
	
	int volume() {
	return l*b*height;
	}
}



