import java.util.Scanner;
class Odd{
public static void odd(int a)
{
		int last = a%10;
		int temp = a/10;
		int third = temp%10;
		int temp1 = temp/10;
		int s = temp1/10;
		int first = temp1%10;
		if (last%2==0&&first%2==0&&third%2==0&&s%2==0)
		{
			System.out.println("it is false");
		}
		else
		{
						System.out.println("it is true");
		}
				
	}

public static void main(String[]args)
{
	Scanner Scan = new Scanner(System.in);
System.out.println("enter the digits to check");
int a = Scan.nextInt();
odd(a);
}
}
