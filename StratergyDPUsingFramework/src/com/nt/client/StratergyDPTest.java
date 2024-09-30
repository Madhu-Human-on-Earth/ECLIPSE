package com.nt.client;

import java.awt.BufferCapabilities.FlipContents;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;

public class StratergyDPTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/applicationContext");
		
		//get targte spring bean class obj
		
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		
		//invoke b,method
		String result=fpkt.shopping(new String[] {"shirt","trouser",
		"Hat"},new float[] {3000.0f,5000.0f,1000.0f});
System.out.println(result);

ctx.close();
	}
}
