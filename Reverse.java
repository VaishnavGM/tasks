class Reverse
{
public static  void main(String args[])
{
int r,n = 1234;
int temp;
int sum = 0;
temp = n;

while(n>0)
{
r = n%10;
sum = (sum*10)+r;
n = n/10;
}
System.out.println("the reverse is"+sum);

}}
