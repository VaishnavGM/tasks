import java.util.Scanner;
class Leap{
public static void leap(int a)
{
int k = a%4;
if (k==0)
{
System.out.println("it is leap year");
}
else
{
System.out.println("it is not leap year");
}
}
public static void main(String[]args)
{

Scanner Scan = new Scanner(System.in);
System.out.println("enter the year to find");
int a = Scan.nextInt();
leap(a);
}
}
