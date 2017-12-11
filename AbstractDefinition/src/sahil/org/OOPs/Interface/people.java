package sahil.org.OOPs.Interface;

interface people 
{
	 String Address = "105-b railway colony etawah";
	 int age = 21;       //every variable is by default public/static/final in interface
	 
	 void getQuality( String quality);   //every method is by default public,abstract
	 void getCharacterstics(int id,String name,String compnyName);
	 int getAge();
	 String getAddress();
}

class sahil implements people 
{

	@Override
	public void getQuality(String quality) 
	{
		System.out.println("sahil is a kind of person who is having "+quality);
	}

	@Override
	public void getCharacterstics(int id,String name,String compnyName) 
	{
		System.out.println("Overall detail of the person :");
		System.out.println("His id "+id);
		System.out.println("His name :"+name);
		System.out.println("compny he working for :"+compnyName);
	}

	@Override
	public int getAge() 
	{
		// TODO Auto-generated method stub
		return age;
		
	}

	@Override
	public String getAddress() 
	{
		// TODO Auto-generated method stub
		return Address;
	}
}

class XXX
{
	public static void main(String[] args) 
	{
		sahil s1 = new sahil();
		String addr = s1.getAddress();
		int age = s1.getAge();
		s1.getCharacterstics(21, "sahil", "JP Morgan");
		System.out.println("person age :"+age);
		System.out.println("person address :"+addr);
		s1.getQuality(" no quality at all");
		int objectHashcode = s1.hashCode();
		System.out.println("hashcode for this object which always gets changed: "+objectHashcode);
	}
}

