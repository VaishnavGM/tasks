import java.util.Scanner;
public class Ee {
public static void main(String[] args) {
Scanner Scan = new Scanner(System.in);
String s =Scan.nextLine();
String m = Scan.nextLine();
String h = Scan.nextLine();
int a = Scan.nextInt();
int b = Scan.nextInt();
int c = Scan.nextInt();
for(int i=1;i<=3;i++)
{
	if(i==1)
	{
	int n =15;
	System.out.println("========================");
 System.out.print(s);
    for(int j=1;j<=n;j++)
    {
         System.out.print(" ");

    }
     System.out.print(a);
          System.out.println("");
	}
	else if(i==2)
	{
		System.out.print(m);
    for(int j=1;j<=15;j++)
    {
         System.out.print(" ");

    }
     System.out.print(b);
          System.out.println("");
	}
	
	else 
	{
		 
		System.out.print(h);
    for(int j=1;j<=15;j++)
    {
         System.out.print(" ");

    }
     System.out.print(c);
          System.out.println("");
		  	 System.out.println("========================");

	}
}

    }
}
  
        
