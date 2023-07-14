import java.util.Scanner;
class Vaishnav
{
	static int a;
	static int b;
	int c;
	int x;
}
class Raja
{
	static int d = 10;
	int e = 30;
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
				System.out.println("enter The first static value :");
Vaishnav.a = s.nextInt();
System.out.println("enter the seccond static value");
Vaishnav.b = s.nextInt();
int f = Vaishnav.a+Vaishnav.b;
System.out.println("The sum of two static value is :"+f);
int m = Raja.d+f;
System.out.println("The sum of all static value is :"+m);
Vaishnav obj = new Vaishnav();
obj.c = s.nextInt();
//System.out.println("the first instance value is "+obj.c);





	}
}

	 