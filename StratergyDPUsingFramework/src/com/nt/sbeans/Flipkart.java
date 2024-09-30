package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
	
	//HAS -A Property
	@Autowired
	@Qualifier("dtdc")
	private Courier courier;
	
	public Flipkart() {
		System.out.println("flipkart:0-PARAM CONSTRUCTOR");
	}
	
//B.method
	
	public String shopping(String items[],float prices[]) {
		System.out.println("Flopkart.shopping(-,-");
		//calcualte bill amount
		float billAmt=0.0f;
		for(float p:prices) {
			billAmt+=p;
		}
		
		//generate order id
		int oid=new Random().nextInt(10000);
		
		//use couroer 
		
		String msg=courier.deliver(oid);
		
return Arrays.toString(items)+" are ordered with prices "+Arrays.toString(prices)+" having bill Amount ::"+billAmt+"---"+msg;
		
	}
}
