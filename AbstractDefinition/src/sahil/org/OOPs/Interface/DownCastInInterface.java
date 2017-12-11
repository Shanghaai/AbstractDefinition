package sahil.org.OOPs.Interface;

interface DownCastInInterface {

	int k =12;
	void test1();
}

interface demo2 extends DownCastInInterface //an interface can inherite using extends
{
	void test2();
}

class sample1 implements demo2
{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1() method is implemented in sample1 class");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2() method is implemented in sample1");
	}
}

class mainclass{
	
	public static void main(String[] args) {
		
		DownCastInInterface d;
		d = new sample1();
		d.test1();   //by using demo1 reference we can't access properties of demo2
		System.out.println("------------------------------");
		demo2 d2 = (demo2)d; //to get the properties of demo2 we must downcast it first
		d2.test1();
		d2.test2();
		String nameofObject = d2.toString();
		System.out.println("name of the object :"+nameofObject);
	}
}
