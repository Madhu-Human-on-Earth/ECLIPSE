package operators;
import java.util.*;
public class GenericType {
	
	public static void main(String[] args) {
		/*
		 * Generic eliminates the need of explicit type casting in collections.
		 * A collection is a set of interfaces and classes that sort and manipulates a group of data into a single unit.
		 * */
		ArrayList<Integer> list=new ArrayList<>();
		Numberingsystem(list);
		int tot=0;
		
		Iterator<Integer> iter=list.iterator();
		
		while(iter.hasNext()) {
			Integer val=iter.next();
			tot+=val;
		}
		
		
		System.out.println(tot);
		
	}
	
	private static void Numberingsystem(ArrayList<Integer> list) {
		list.add(1);
		list.add(2);
	}

}
