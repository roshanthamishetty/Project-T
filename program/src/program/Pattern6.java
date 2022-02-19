package program;
import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("how many rows of pattern");
		Scanner sc=new Scanner(System.in);
int n=sc.nextInt();


for(int i=1;i<=n;i++)//row
{
	for(int j=1;j<=i;j++)//coloum
	{
		
		System.out.print(i+" ");
	}
	System.out.println(" ");
}

	}

}
