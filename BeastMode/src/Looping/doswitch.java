package Looping;

public class doswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col, y;
		
		row=1;
		
		do {
			col=1;
			do {
				y=row*col;
				System.out.print(" "+y);
				col+=1;
			}
			while(col<=3);
				System.out.println("\n");
				row+=1;
		
		}
		
		while(row<=3);

	}

}
