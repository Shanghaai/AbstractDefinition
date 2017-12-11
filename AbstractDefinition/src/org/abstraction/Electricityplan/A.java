package org.abstraction.Electricityplan;

interface A 
{
	int x = 12;
	void m1();
	void run();
	void service();
}

abstract class B implements A
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("running run method...");
	
	}
	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("running service method...");
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
	System.out.println("in the m1() method inside abstract class B");	
	}
}

class C extends B
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("running m1() method...");
	}
}
class MainClass 
{
	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.run();
		c.service();
		int x1 = A.x;
		System.out.println(x1);
	}
}
