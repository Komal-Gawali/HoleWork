package variable;

public class StaticVar {
	static int v = 45;
	public void m3() {
		System.out.println("The value of v = " + v);
	}

	public static void main(String[] args) {
		StaticVar n = new StaticVar();
		n.m3();
		System.out.println("new print is " + v);

	}

}
