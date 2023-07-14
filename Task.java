import java.util.Scanner;
class Task{
public static void main(String[]args)
{
int age,exp,salary,bonus;
char name;
Scanner Scan = new Scanner(System.in);
System.out.println("enter the age");
 age = Scan.nextInt();
System.out.println("enter the exp");
 exp = Scan.nextInt();
System.out.println("enter the salary");
 salary = Scan.nextInt();
System.out.println("enter the name");
 name = Scan.next().charAt(0);
 if(age>=25&&exp>=5&&salary>=15000)
 {
	 System.out.println("5k bonus");
	 
 }else if(age>=35&&exp>=10&&salary>=30000)
 {
	 System.out.println("10 k bonus");
	 
 }else if(age>=45&&exp>=15&&salary>=50000)
 {
	 System.out.println("15 k bonus");
	 
 }


}}
 