package program;

import java.util.Scanner;

public class Arrayprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=s.nextInt();
int arr[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
{
	arr[i]=s.nextInt();

	}
//for(int i:arr) 
for(int i=0;i<n;i++)
{
	

	System.out.println("arr["+i+"]="+arr[i]);
}
	}
}

