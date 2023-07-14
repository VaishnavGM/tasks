import java.util.Scanner;
class Bmi{
public static void main (String[]args)
{
float bmi;
float weight;
float height;
Scanner s = new Scanner(System.in);
System.out.println("enter the weight");
float weight = s.nextFloat();
System.out.println("enter the height");
float height = s.nextFloat();
float z = heigth*height;
float k = weight/z;
System.out.println("the bgmi is"+k);
}
}

