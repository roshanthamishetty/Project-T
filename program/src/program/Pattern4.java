package program;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,row=6;
for(i=0;i<=row;i++)
{
	for(j=1*(row-i);j>=0;j--)
	{
		System.out.print(" ");
	}
	for(j=0;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println(" ");
}
	}

}
