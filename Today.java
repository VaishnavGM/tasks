import java.util.Scanner;
class Today
{
static int a;
static int b;
int c;
int D;
}
class yesterday
{
	static int e = 10;
int f = 20;
}

class Tomorrow	
{
public static void main(String[]args)
{
	System.out.println("yesterday.e");
     yesterday obj = new yesterday();
      System.out.println(obj.f);
	  Scanner s = new Scanner(System.in);
	  System.out.println("enter the first satic value");
	  Today.a = s.nextInt();
	  System.out.println("enter the second satic value");
	  Today.b = s.nextInt();
	  int i= Today.a+Today.b;
	  System.out.println("The sum of two static values "+i);
	  Today ob = new Today();
	  	  System.out.println("enter the first instamce value");
 ob.c = s.nextInt();
 Today os = new Today();
 	  	  System.out.println("enter the second instamce value");
os.D = s.nextInt();

	 int z = ob.c+ob.D ;
	 	  System.out.println("The sum of two insatance values "+z);
		  System.out.println("the sum of two static plus one instance value is "+yesterday.e+i);
		  
		  

	  
	
	
	
	  
	  
	  
	  
	  

}}