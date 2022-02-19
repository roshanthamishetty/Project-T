package program;

import java.util.Scanner;

public class additionof2numbersscanner {

	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:" );
	num1=sc.nextInt();
		System.out.println("Enter the number:");
		num2=sc.nextInt();
		 sc.close();
		 sum=num1+num2;
		 System.out.println("sum of this numbers:"+sum);
		 
	}

}
