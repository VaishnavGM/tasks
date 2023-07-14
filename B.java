import java.util.Scanner;
class B{
int a,b,c,d,e,f;
public static void main(String[]args)
{
Scanner s = new Scanner(System.in);
System.out.println("enter the value of a");
int a = s.nextInt();
System.out.println("enter the value of b");
int b = s.nextInt();
System.out.println("enter the value of c");
int c = s.nextInt();
System.out.println("enter the value of d");

int d = s.nextInt();
System.out.println("enter the value of e");
int e = s.nextInt();
System.out.println("enter the value of f");
int f = s.nextInt();
int x = a+b+c+d+e+f;
System.out.println("The sum of numbers is"+x);
int y = a-b-c-d-e-f;
System.out.println("The subtraction of numbers is"+y);
int o = a/b/c/d/e/f;
System.out.println("The division of numbers is"+o);
}}