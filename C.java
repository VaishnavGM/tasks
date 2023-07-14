import java.util.Scanner;
class C{

public static void main(String[]args)
{
	int age;
int hourslived;
int dayslived;
int minuteslived;

	Scanner s = new Scanner(System.in);
	System.out.println("enter the age");
	age = s.nextInt();
	hourslived = age*365*24*60;
	System.out.println("the no of hours lived is "+hourslived);
	dayslived = age*365;
		System.out.println("the no of days lived is "+dayslived);
minuteslived = age*365*24*60*60;
		System.out.println("the no of minutes lived is "+minuteslived);

}

}