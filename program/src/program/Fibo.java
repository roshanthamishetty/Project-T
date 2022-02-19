package program;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	do {	

int f0=0,f1=1,f2;
System.out.print("no.of terms:");
int a=s.nextInt();

System.out.print(f0+" "+f1+" ");
for(int i=3;i<=a;i++)
{
	f2=f0+f1;
	System.out.print(f2+" ");
	f0=f1;
	f1=f2;
}
	}while(true);
	
	
}
}
