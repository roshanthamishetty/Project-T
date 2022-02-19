package program;

import java.util.Scanner;

public class nameusingstringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter name of elements");
		int n=s.nextInt();
String arr[]=new String[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
       
	      arr[i]=s.nextLine();
	  
//for(String i:arr) 
for(int i=0;i<n;i++)
       {
	      System.out.println(i);
       }
}

}


