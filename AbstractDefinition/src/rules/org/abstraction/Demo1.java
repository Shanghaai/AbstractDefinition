package rules.org.abstraction;

public abstract class Demo1 
{
	int k = 12;
	static int i = 12;
	
	abstract void test1();// incomplete method 
	abstract void test2();// incomplete method
}

class  sample1 extends Demo1
{
	void test1()
	{
		System.out.println("test1() defined in sample1 class");//making a method complete
	}
	void test2()
	{
		System.out.println("test2() defined in sample1 class"); //making a method complete
	}
}

class mainclass
{
	public static void main(String[] args) 
	{ 
		System.out.println("Game started");
		
		System.out.println("i value : "+Demo1.i);
		sample1 s1 = new sample1();
		s1.test1();
		s1.test2();
		
		System.out.println("Game end");
     }
}
