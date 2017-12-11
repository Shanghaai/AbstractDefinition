package org.abstraction.Electricityplan;

public class PlanMain 
{
	public static void main(String[] args) 
	{
		Plan p;
		p = new CommercialPlan(); //using run-time polymorphism RTP
		p.getRate();
		p.calculateBill(50);
		
		p = new DomesticPLAN(); //using run-time polymorphism RTP
		p.getRate();
		p.calculateBill(100);
	}
}
