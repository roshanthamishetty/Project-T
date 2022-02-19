package program;
import java.util.Scanner;
public class Switchss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
do {
System.out.println("please enter \n 1-sub,\n 2-add,\n 3-mul,\n 4-div");
int x=sc.nextInt();
System.out.println("please enter value of a");
int a=sc.nextInt();
System.out.println("please enter value of b");
int b= sc.nextInt();
if(x>0) {
	switch(x) {
	case 1:
		System.out.println("performing subntraction");
		int sub =a-b;
		System.out.println(sub);
		break;
	case 2:
		System.out.println("performing addition");
		int add =a+b;
		System.out.println(add);
		break;
	case 3:
		System.out.println("performing multiplication");
		int mul=a*b;
		System.out.println(mul);
		break;
	case 4:
		System.out.println("performing divison");
		int div =a/b;
		System.out.println(div);
		break;
		default:
			System.out.println("invalid operation");
	
	}
	
}

	}while(true);

	}
}
