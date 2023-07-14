abstract class Ss{
	void ks(int a,int b)
	{
		
	System.out.println(a+b);
}
void ks(){
	System.out.println("l");
}}
class Bs extends Ss
{
	void l()
	{
	System.out.println("sa");
	}
	}
class Cs extends Bs
{
	void s()
	{
	System.out.println("fa");
	}
}
class Ms{
	public static void main(String[]args)
	{
		Bs obj = new Bs();
		obj.ks(10,20);
	}
}
