package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements Courier{
	
	public BlueDart() {
		System.out.println("BlueDart:0-PARAM CONSTRUCTOR");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+" order id order assigned to BludeDart for delivery" ;
	}

	
	
}
