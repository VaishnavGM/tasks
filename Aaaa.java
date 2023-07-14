interface Aaaa
{
	abstract void s(int a,int b);
}
class Ba implements Aaaa
{
public void s(int a,int b)
	{
		System.out.println(a+b);
	}
}
	abstract class Ca implements Aaaa
	{
		public void k(){
		System.out.println("njb");
		}
	}
	class h
	{
		public static void main(String[]args)
		{
			Ba obj = new Ba();
			obj.s(10,20);
			
		}
	}
	