import java.util.Scanner;
class D
{
public static void main(String[]args)
{
	double inches;
	double meters;
	
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length in inches: ");
        inches = s.nextDouble();

         meters = inches * 0.0254;

        System.out.println("the meters value is"+meters);
    }
}