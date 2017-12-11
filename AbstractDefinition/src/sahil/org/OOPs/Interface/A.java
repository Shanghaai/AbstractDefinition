package sahil.org.OOPs.Interface;

interface A {
	String m();
}

interface B
{
	String m();
	
}

interface C extends A,B
{
	
		String m();
}