import java.util.Scanner;
class Nested
{
public static void main(String[]args)
{
int a,b,c;
Scanner Scan = new Scanner(System.in);
System.out.println("enter the value");
a = Scan.nextInt();
switch(a)
{
case 1:
System.out.println("enter the value to check");
 b = Scan.nextInt();
 while(b>0){

if(b%2==0) {
	 System.out.println("it is even");
	 break;
 }
 else
 {
	 System.out.println("odd");
 c = Scan.nextInt();
 }}
break;
 
 default:
 	 	 System.out.println("it is v");
	 
 }
  
}
}