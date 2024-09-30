package com.nt.factory;
import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {

//static factory method
	
public static Flipkart getInstance(String courierName) {
	System.out.println("FlipkartFactory.getInstance()");
	
	//create dependent class object
	Courier courier=null;
	
	if(courierName.equalsIgnoreCase("dtdc")) {
courier=new DTDC();
}
	else if(courierName.equalsIgnoreCase("bDart")) {
		courier=new BlueDart();
	}
	else 
		throw new IllegalArgumentException("INVALID INPUTS");
		
		//create target class obj
	Flipkart fpkt=new Flipkart();
		
	
		//assign dependent class obje to target class obj
	fpkt.setCourier(courier);
		//return targete class obj
	return fpkt;
	
}
}
