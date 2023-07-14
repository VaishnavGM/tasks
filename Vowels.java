import java.util.Scanner;
class Vowels
{
public static int vowels(String b)
{
	int count = 0;
for(int i=0;i<b.length();i++)
{
if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u')
{
count++;
}
}
return count;

}

public static void main(String []args)
{
Scanner Scan = new Scanner(System.in);
System.out.println("enter the word");
String a = Scan.nextLine();
int total=vowels(a);

System.out.println(total);
}
}