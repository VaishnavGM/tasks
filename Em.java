class Em
{
public static void main(String[]args)
{
int row,col,j;
int n = 5;
for(row=1;row<=5;row++)
{
	for(j=n;j>=row;j--)
	{
		System.out.print(" ");
	}
	for(col=n;col>=row;col--)
	{
		System.out.print("*");
	}
	System.out.println("");
}
}
}