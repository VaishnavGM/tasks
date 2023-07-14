import java.util.Scanner;
class Tables
{
public static void main(String args[])
{
int a,b,c,d;
Scanner Scan = new Scanner(System.in);
System.out.println("enter the table to print");
 b = Scan.nextInt();
 a=1;
 while(a<=10)
{
	d = a*b;
	System.out.println(a+"*"+b+"="+a*b);
a++;
	}
System.out.println("enter odd or even");
int z = Scan.nextInt();
switch(z)
{
case 1:
while(a<=10)
{
	d = a*b;
	if(d%2==0)
	{
	System.out.println(a+"*"+b+"="+a*b);
		a++;}
	}
	break;
	case 2:
	while(a<=10)
{
	d = a*b;
	if(d%2!=0)
	{
	System.out.println(a+"*"+b+"="+a*b);
a++;
	}
	}
	break;
	default:
	System.out.println("no");
}	
}
}







