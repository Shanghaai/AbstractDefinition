package org.abstraction.Electricityplan;

public abstract class Plan
{
	protected double  rate;
	abstract void getRate();
	
	void calculateBill(int units)
	{
		System.out.println("Your Monthly Bill for "+units+" units is ");
		System.out.println(rate*units);
	}
}
 class CommercialPlan extends Plan
 {
	 void getRate()
	 {
		 rate = 5;
	 }
 }
 class DomesticPLAN extends Plan
 {
	 void getRate()
	 {
		 rate = 10;
	 }
 }
