package Opps;

public class nest_mtds {
	public static void main(String[] args) {
		Nesting n=new Nesting(23,-76);
		n.display();
	}

}

class Nesting{
	int n,m;
	Nesting(int x, int y){
		m=x;
		n=y;
		
	}
	
	int largest() {
		if(m>=n) {
			return m;
		}
		else return n;
	}
	
	void display() {
		int lar=largest();
		System.out.println(lar);
				}
}
