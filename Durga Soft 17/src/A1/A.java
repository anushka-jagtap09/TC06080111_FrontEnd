package A1;

public class A {

	protected void m1() {
		System.out.println("This is misunderstoood pkg in java");
		// TODO Auto-generated method stub

	}

}

class B extends A{
	public static void main(String[]args) {
		A a= new A();
		a.m1();
		
		B b= new B();
		b.m1();
		
		A a1= new B();
		a1.m1();
	}
	
}
