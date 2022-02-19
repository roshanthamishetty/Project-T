package program;

public class StringPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sc1=("Roshan Thamishetty");
String sc2=("  roshan Thamishetty  ");
System.out.println(sc1);
System.out.println(sc2);

System.out.println(sc1.charAt(8));
System.out.println(sc1.length());
System.out.println(sc1.toUpperCase());
System.out.println(sc1.toLowerCase());
System.out.println(sc1.equalsIgnoreCase(sc2));
System.out.println(sc1.equals(sc2));
System.out.println(sc1.concat("BITTU "));
String sc3=sc1+sc2; 
System.out.println(sc3);
System.out.println(sc1.substring(2, 5));
System.out.println(sc1.replace('R', 'j'));
System.out.println(sc2.trim());
System.out.println(sc1.repeat(10));


	}

}
