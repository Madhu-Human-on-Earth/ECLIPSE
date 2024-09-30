package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class FlipKart{
	private Courier courier;
	public FlipKart()
	{
		System.out.println("Flipart: 0-param");
	}
	public void setCourier(Courier courier)
	{
		System.out.println("FlipKart.setCourier():");
		this.courier=courier;
	}
	
	public String shopping(String items[], float prices[])
	{
		System.out.println("FlipKART.SHOPPING()");
		
		//BILL
		float billAmnt=0.0f;
		for(float p:prices)
		{
			billAmnt+=p;
		}
		//generate order id
		int oid =new Random().nextInt(10000);
		
		//use courrier for delivery
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+"are ordered with prices "+Arrays.toString(prices)+"having bill Amount::"+billAmnt+"----"+msg;
		
	}
}
