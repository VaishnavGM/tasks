class Pattem
{
public static void main(String[]args)
{
int row,column;
int n=5;
for(row = 1;row<=n;row++);
{
	for(column=1;column<=n-row;column++)
	{
		System.out.print("*");
	}
	System.out.println("");
}
}
}