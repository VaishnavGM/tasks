import java.util.Scanner;
class Am
{
void mo(int a,int  b)
{
	int c = a+b;
	System.out.println(c);
	
}}
class Cm extends Am
{
	void mo(int c,int e)
	{
		int d = c-e;
				super.mo(c,e);

			System.out.println(d);
			
	}}
	class Bm extends Am
	{
		public static void main(String[]args)
		{
			Scanner Scan = new Scanner(System.in);
				System.out.println("enter c");
				int c = Scan.nextInt();
					System.out.println("enter e");
					int e = Scan.nextInt();
					Cm obj = new Cm();
					obj.mo(c,e);
		}
	}

