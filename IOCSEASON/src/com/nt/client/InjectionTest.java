package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class InjectionTest {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		SeasonFinder finder = (SeasonFinder)ctx.getBean("sf");
		
		String result=finder.findSeasonName();
		System.out.println("Result is::"+ result);
	}

}
