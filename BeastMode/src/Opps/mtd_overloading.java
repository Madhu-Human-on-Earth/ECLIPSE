package Opps;

public class mtd_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room1=new Room(25.0f,15.0f);
		Room room2=new Room(45.0f);
		
		System.out.println(room2.area());
		

	}

}


class Room{
	float length;
	float breadth;
	
	Room(float x, float y){
		length=x;
		breadth=y;
	}
	
	Room(float x){
		length=breadth=x;
	}
	float area() {
		return (length*breadth);
	}
}