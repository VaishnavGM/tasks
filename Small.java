import java.util.Scanner;
class Small
{
public static void Mininum(int a,int b,int c)
{
int z = Math.min(a,b);
int x  = Math.min(z,c);
System.out.println("the small is"+x);
int k = a+b+c;
int n =k/3;
System.out.println("the average is "+n);
}
public static void main(String[]args)
{
Scanner Scan = new Scanner(System.in);
System.out.println("enter the a");
int a = Scan.nextInt();
System.out.println("enter the b");
int b = Scan.nextInt();
System.out.println("enter the c");
int c = Scan.nextInt();
Mininum(a,b,c);

}
}