import java.util.Scanner;
class Armstrong
{
public static void main(String[]args)
{
int a,l,temp,f,m,m3,l3,f3,z;
Scanner Scan = new Scanner(System.in);
System.out.println("enter the number to check");
a = Scan.nextInt();
l = a%10;
temp = a/10;
f = temp/10;
m  = temp%10;
m3 = m*m*m;
l3  = l*l*l;
f3 = f*f*f;
z = m3+l3+f3;
if(z==a)
{
	System.out.println("is am");
}
else
{
	System.out.println("not am");
}


}
}
