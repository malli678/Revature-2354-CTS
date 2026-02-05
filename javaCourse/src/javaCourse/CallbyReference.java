package javaCourse;

public class CallbyReference {

	public static void main(String[] args) {
		Ref name1 = new Ref("Test");
		Ref name2 = new Ref("Sample");
		System.out.println(
				"In main function before calling swap" + "\n name1 = " + name1.value + "\n name2 = " + name2.value);
		Swap(name1, name2);
		System.out.println(
				"In main function After calling swap" + "\n name1 = " + name1.value + "\n name2 = " + name2.value);
	}

	public static void Swap(Ref name1, Ref name2) {
		System.out.println("\n Swap method Before Swaping" + "\n Name1 = " + name1.value + "\n Name2 = " + name2.value);
		String temp = name1.value;
		name1.value = name2.value;
		name2.value = temp;
		System.out.println("\n Swap method After Swaping" + "\n Name1 = " + name1.value + "\n Name2 = " + name2.value);
	}

	// Wrapper class (act like a reference holder)
	static class Ref {
		String value;

		Ref(String value) {
			this.value = value;
		}
	}

}
