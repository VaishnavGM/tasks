import java.util.Scanner;
class Nest
{
public static void main(String[]args)
{
int a,b,c;
Scanner Scan = new Scanner(System.in);
System.out.println("enter the first value");
a = Scan.nextInt();
System.out.println("enter the second value");
b = Scan.nextInt();
System.out.println("enter the switch value");
c = Scan.nextInt();

switch(c)
{
case 1:
System.out.println(a+b);
break;
case 2:
System.out.println(a-b);
break;
case 3:
System.out.println(a/b);
break;
case 4:
System.out.println(a%b);
break;
default:
System.out.println("none");
}
}}
