package com.nt.client;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class InjectionTest {

	public static void main(String[] args) {
		//create the IOC Container
		//ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	FileSystemXmlApplicationContext ctx=
				  new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");         
		//get spring bean class obj ref
		SeasonFinder finder = (SeasonFinder)ctx.getBean("sf");
		
		String result=finder.findSeasonName();
		
		System.out.println("Result is::"+result);
		
		ctx.close();
	}

}