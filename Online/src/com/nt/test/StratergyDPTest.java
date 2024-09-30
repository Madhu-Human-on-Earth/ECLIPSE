package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StratergyDPTest {

	public static void main(String[] args) {
		//get Flipkart class obj using the factory
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		//invoke b.method
		String result=fpkt.shopping(new String[] {"shirt","trouser",
				"Hat"},new float[] {3000.0f,5000.0f,1000.0f});
		System.out.println(result);
	}
}
