import java.util.Scanner;
class Area
{
public static void area(double a,double b,double c)
{
	double area;
double s;
s = a+b+c/2;
area = s*(s-a)*(s-b)*(s-c);
System.out.println("area of triangle is"+Math.pow(area,0.5));
}
public static void main(String[]args)
{
Scanner Scan = new Scanner(System.in);
System.out.println("enter the a");
double a = Scan.nextInt();
System.out.println("enter the b");
double b = Scan.nextInt();
System.out.println("enter the c");
double c = Scan.nextInt();
   area(a,b,c);
   }
   }
      