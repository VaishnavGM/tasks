import java.util.Scanner;
class Pr
{
	Pr(int a,int b){
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[]args)
	{
		
	Scanner Scan = new Scanner(System.in);
	System.out.println("enter a");
int a = Scan.nextInt();
		System.out.println("enter b");
 int b = Scan.nextInt();
 Pr obj = new Pr(a,b);

	}
}
