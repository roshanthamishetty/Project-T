package program;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer rs=new StringBuffer("roshan");
System.out.println(rs);
System.out.println(rs.insert(2, "R"));
System.out.println(rs.delete(1, 3));
System.out.println(rs.reverse());
System.out.println(rs.append("to java"));
System.out.println(rs.replace(1, 5, "bittu"));
	}

}
