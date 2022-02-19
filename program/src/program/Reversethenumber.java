package program;
import java.util.Scanner;

public class Reversethenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
while(num!=0)
{
	int rem=num%10;
	reverse=reverse*10+rem;
	num=num/10;  
}
System.out.println("reverse:"+reverse);
}
	}

