package program;
import java.util.Scanner;



public class Ifelseifdynamic {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a,b,c");
  int a=sc.nextInt();
   int b=sc.nextInt();
	int c=sc.nextInt();
	if (a>b && a>c)
	{
		System.out.println("a is max");
	}
	else if (b>a && b>c) {
		System.out.println("b is max");
	}
	else {
		System.out.println("c is max");
	}
	}

}
