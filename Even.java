import java.util.Scanner;
class Even
{
public static void main(String args[])
{
int a,i,z;
Scanner Scan = new Scanner(System.in);
System.out.println("enter the number");
i = Scan.nextInt();
System.out.println("even or add");
z = Scan.nextInt();
switch(z){
case 1:
	System.out.println("the even number is");

for(a=0;a<=i;a++)
{
if(a%2==0)
{
System.out.println(""+a);
}
}
break;

case 2:
		System.out.println("the odd numbers are");
for(a=0;a<=i;a++)
{
	if(a%2!=0)
	{
		System.out.println(""+a);
	}
}
	break;
	default:
	System.out.println("vaishnav");

}

}}