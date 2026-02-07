class Parent {
	void property() {
		System.out.println("Assets");
	}
	void marry() {
		System.out.println("Married!");
	}
}
class Child extends Parent {
	void marry() {
		System.out.println("Married to White Girl!");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		Child c = new Child();
		c.property();
		c.marry();
		Parent p = new Parent();
		p.property();
		p.marry();

	}

}
