package program;
import java.util.Scanner;

public class Marksifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("please enter the marks");
Scanner sc=new Scanner(System.in);                                                                    
int obtained_marks=sc.nextInt();
if(obtained_marks <=1 && obtained_marks >=100);{
	if (obtained_marks>=95){
		System.out.println("First class with distingusion");
	}
	else if (obtained_marks <=95 && obtained_marks >=75){
		System.out.println("First class");
	}
	else if (obtained_marks <=75 && obtained_marks>=65){
		System.out.println("Second class");
	}
	else if (obtained_marks <=65 && obtained_marks>=55){
		System.out.println("Passed");
	}
	else 
		System.out.println("fail");
}


	}

}
