interface Father
{
abstract void sum();
}
class Son 
{
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
}
 abstract class Daughter implements Father,Son
{
	public void a()
	{
		System.out.println("ssjhs");
	}
}
class M{
	public static void main(String[]args)
	{
		Son obj = new Son();
		obj.sum(10,20);
	}
}