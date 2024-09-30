package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("sf")
public class SeasonFinder {

	
	//HAS A PRROP
	@Autowired
	@Qualifier("dt")//to esacpe from ambiguity
	private LocalDate date;
	
	public  String findSeasonName() {
		//get the current month value
		int month=date.getMonthValue();
		
		if(month>=3 && month<=6) {
			return "Summer seaSon!!";
		}
		else if(month>=7 && month<=10) {
			return "Rainy SeaSon!!";
		}
		else
			return "Winter Season";
		}
}
