class Parent1 {
	void m1() {
		System.out.println("Parent class method.");
	}
}
class Child1 extends Parent1 {
	void m1() {
		System.out.println("Child class method m1");
	}
	void m2() {
		this.m1();
		System.out.println("Child class method m2");
		super.m1();
	}
}
public class SuperKeywordDemo {

	public static void main(String[] args) {
		Child1 c = new Child1();
		c.m2();

	}

}
