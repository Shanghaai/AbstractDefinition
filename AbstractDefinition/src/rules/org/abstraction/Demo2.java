package rules.org.abstraction;

public abstract class Demo2 
{
	abstract void test1(); //incomplete method
	abstract void test2 ();//incomplete method  
}

abstract class sample3  extends Demo2
{
	void test2()
	{
		System.out.println("test2() defined in sample 2 /case no.2 ");
	}
}
class sample2 extends sample3
{
	void test1()
	{
		System.out.println("test1() defined in sample class //extends case no.2");
	}
}
class  mainclass2
{
	public static void main(String [] args)
	{
		System.out.println("Game started");
		
		sample2 s1 = new sample2();
		s1.test1();
		s1.test2();
		
		System.out.println("Game end");
	}
}
