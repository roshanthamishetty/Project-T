package program;

import java.util.Scanner;

public class Factorialusingwhilploop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int fact=1;int i=1;
Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num =sc.nextInt();
	while(i<=num)
	{
		fact=fact*i;
		i++;
	}
	System.out.println("\nfactorial of"+num+"is"+fact);
	
		
	}
	}
	


