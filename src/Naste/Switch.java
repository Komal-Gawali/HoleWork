package Naste;

public class Switch {

	public static void main(String[] args) {
		float a=12, b= 33;
		char operation ='/';
		switch  ( operation)
		{
		case '+':
		float c= a+b;
		{System.out.println("The addition of two integer is " + c);
			
		} break; 
		case '-':
			float d= a-b;
			{System.out.println("The substraction is " + d);
			} break;
		case '*': 
			float e= a*b; {
				System.out.println("The multiplication is " + e);
			}
		break;
		case '/':
			float f= b/a;
			{System.out.println("the division is " + f);
			}
		}
	}

}
