package ControlStat;

public class UseOfSwitch {
        public static void main(String[] args) {
		char operator = '*';
		int a = 12 , b = 98;
		switch (operator)
		{
		case '+':
			int c = a+b ;
		System.out.println("the answer is  " + c);	
		 break ; 
		case '-':
			int d = a - b ;
			System.out.println("the answer is  "+ d );
			break;
		case '*':
			int e = a*b;
			System.out.println("the answer is  "+ e);
			break;
		case '/':
			int f = a/b;
			System.out.println("the answer is  "+ f);
			}
	}

}
