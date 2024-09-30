package LL;

import java.util.LinkedList;

public class CollectionsLL {

	public static void main(String[] args) {

		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(1,100);
		list.addFirst(50);
		list.set(0,60);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
			
	}

}
