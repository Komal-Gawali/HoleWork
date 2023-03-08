package variable;

public class LocalVar {
// System.out.println();
	
	public void m2() {
		String v = "Sasha";
		 System.out.println("My name is " + v);
	}
	public static  void main(String[] args) {
		LocalVar g = new LocalVar();
		g.m2();
//		System.out.println("_________" + v.this + "----------");

	}

}
