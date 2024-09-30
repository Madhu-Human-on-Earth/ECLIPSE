package com.nt.factory;


import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.FlipKart;

public class FlipKartFactory {

	
	//static fact mtd
	public static FlipKart getInstance(String courierName)
	{
		System.out.println("FlipKart.getInstance()");
		
		//create dependentclass object
		Courier courier=null;
		if(courierName.equalsIgnoreCase("dtdc"))
		{
			courier=new DTDC();
			
		}
		else if(courierName.equalsIgnoreCase("bDart"))
		{
			courier=new BlueDart();
		}
		else {
			throw new IllegalArgumentException("Invalid inputs");
			
		}
			//create target class obj
			FlipKart fpkt=new FlipKart();
			//assign dependent class object to target class obj
			fpkt.setCourier(courier);
			return fpkt;
			
		}
		
	
}

