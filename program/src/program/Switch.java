package program;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Score(0-100)
		int Score=70;
		switch(Score/10)
		{
		case 9:
		System.out.println("Grade is A");
		break;
		case 8:
		System.out.println("Grade is B");
		break;
		case 7:
		System.out.println("grads is C");
		break;
		case 6:
		System.out.println("Grade is D");
		break;
		case 5:
		System.out.println("Grade is E");
		break;
		default:
		System.out.println("Failed");
		break;
		}
		
		

	}

}
