package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//
//@Component("fpkt")//scope
//@Scope("singleton")//scope
public  class Flipkart {
	//HAS A PROPERTY
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart::0-param construcor");
	}
	
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	//b.method
	public String shopping(String items[], float prices[]) {
		System.out.println("Flipkart.shopping(-,-)");
	
	
	//calculate bill amount
	float billAmt=0.0f;
	for(float p:prices) {
		billAmt=billAmt+p;
	}
	
//generate order oid
	int oid=new Random().nextInt(10000);
	
	//use courier for delivery
	String msg=courier.deliver(oid);
	return Arrays.toString(items)+" are ordered with prices "+Arrays.toString(prices)+" having bill Amount::"+billAmt+"----"+msg;
}
}
