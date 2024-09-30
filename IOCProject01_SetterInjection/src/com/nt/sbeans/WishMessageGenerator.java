package com.nt.sbeans;

import java.sql.Date;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	//HAS A PROPERTY
	//private LocalDateTime dateTime;
	//private Date dt;
	
	//here field injection.. here IOC conatiner access the priavate HAS-A property of target 
	//class obj using reflect API to inject depemdent class object to the property
	//For this we eneed to place @Autowired on top of HAS-A prop(fielsd ),,,with this we reducd the constructor 
	@Autowired
	private LocalDateTime dateTime;
	
	
//	@Autowired
//	public void assignData(LocalDateTime dateTime)
//	{
//		System.out.println("WishMessageGenerator.assignData()(arbitary method)");
//		this.dateTime=dateTime;
//	}
//	public void setDateTime(LocalDateTime dateTime)
//	{
//		System.out.println("WishMessageGenerator.setDateTime()");
//		this.dateTime=dateTime;
//	}
	
	//b.method
	public String generateWishMessage(String user)
	{
		System.out.println(dateTime+" ");
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hour=dateTime.getHour();
		
		if(hour < 12)
		{
			return "Good Morning::"+user;
		}
		else if(hour < 16)
		{
			return "Good Afternoon::"+user;

		}
		else if(hour < 20)
		{
			return "Good Evening::"+user;

		}else {
			return "Good night::"+user;

		}
	
	
}
}
