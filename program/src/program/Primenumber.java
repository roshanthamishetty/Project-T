package program;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,i,count=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
num=s.nextInt();
for(i=2;i<num;i++)
{
	if(num%i==0)
	{
		count++;
		break;
	}
}
		if(count==0)
		{
			
		System.out.println("\\n it is a prime number");
		}
		else {
			System.out.println("\n it is not a prime number");
	}
	}

}
