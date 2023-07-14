import java.util.Scanner;
class Km{
void mo(int a,int b)
{
	
	int c = a+b;
		System.out.println(c);
}}
class Lm extends Km
{
	void mo(int d,int e)
	{
	
		int f = e+d;
			System.out.println(f);
	}
	void mo(int x)
		{
				System.out.println("the value os x is"+x);
		}
}
	class Sm extends Lm{
		void Ls(int g ,int h)
		{
		
			int i =g+h;
				System.out.println(i);
	}}
		class main{
			public static void main(String[]args)
			{
				Scanner Scan = new Scanner(System.in);
				System.out.println("enter d");
				int d = Scan.nextInt();
					System.out.println("enter e");
					int e = Scan.nextInt();
					System.out.println("enter x");
				int x = Scan.nextInt();
					Lm obj = new Lm();
                      obj.mo(d,e);
					  obj.mo(x);
			}
	}