package sahil.org.OOPs.Interface;

public class A_Main  implements B,C
	{

		@Override
		public String m() 
		{
			return "hello from D";
			
		}
		
		public static void main(String[] args) {
			A a = new A_Main();
			System.out.println(a.m());
		}
	
	

}
