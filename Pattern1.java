class Pattern1
{
public static void main(String[]args)
{
int row,column;
int n=5;
for(row = 1;row<=n*2;row++)
{
	int total= (row>n)?2*n-row:row;
	for(column=1;column<=total;column++)
	{
		System.out.print("*");
	}
		System.out.println("");
}
}
}
