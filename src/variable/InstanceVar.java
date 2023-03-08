package variable;

public class InstanceVar {
	int a = 12;
	public void m1() {
		
		// int a = 22;
		System.out.println("Value of A = " + a);
	}

	public static void main(String[] args) {
		InstanceVar z = new InstanceVar();
		
		z.m1();
	}

}
