package com.nt.comps;

public final class DTDC implements Courier {

	public DTDC()
	{
		System.out.println("DTDC: 0-PARAM CONSTR ");
	}

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return oid+" ORDER ID ORDER ASSIGNED TO DTDC FOR DELIVERY";
	}
}
