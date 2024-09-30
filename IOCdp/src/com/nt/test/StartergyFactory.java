package com.nt.test;

import com.nt.comps.FlipKart;
import com.nt.factory.FlipKartFactory;

public class StartergyFactory {

	public static void main(String[] args) {
		//get flipkart class obj using the fact 
		FlipKart fpkt=FlipKartFactory.getInstance("dtdc");
		//invoke the b.method
		
		String result=fpkt.shopping(new String[] {"shirt","trosuser","Hat"},new float[] {3000.00f,5000.00f,1000.00f});
		System.out.println(result);
	}
}
