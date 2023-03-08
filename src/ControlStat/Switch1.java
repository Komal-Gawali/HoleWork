package ControlStat;

public class Switch1 {

	public static void main(String[] args) {
//		char oper1 ='/';
		double a=85, b=14;
		switch('*') {
		case '+': 
			System.out.println("Addition is " + (a+b));
			break ;
		case '-':
			System.out.println("substraction is " +(a-b));
			break;
		case '*':
			System.out.println("Multiplication is " + (a*b));
			break;
		case '/':
			System.out.println("division is " + a/b); 
		break ;
		default:
			System.out.println("Insufficient data");
		}
		
	}

}
