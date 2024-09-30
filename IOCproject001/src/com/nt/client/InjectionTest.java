//SetterInjectionTest.java
package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class InjectionTest {

	public static void main(String[] args) {
		//create the IOC container
		FileSystemXmlApplicationContext ctx=
				  new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Target spring bean class obj ref from IOC container
		Object obj=ctx.getBean("wmg");
		//type casting
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		//invoke the b.method
		String result=generator.generateWishMessage("Madhu");
		System.out.println(result);
		
		//close the container
		ctx.close();
		

	}

}