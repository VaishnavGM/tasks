class ReverseStar
{
public static void main(String[]args)
{
int x = 6;
for(int i=0;i<=x;i++)
{
for(int j=x;j>=i;j--)
{
System.out.print("*");
}
System.out.println("");
}}}