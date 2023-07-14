class Single
{
public static void main(String[]args)
{
int row,col;
int n = 5;
for(row=1;row<=n;row++)
{
	for(col=n;col>=row;col--)
	{
		System.out.print(" ");
	}
	for(int s=1;s<=row;s++){
				System.out.print("* ");

	}
	System.out.println("");
}
}
}