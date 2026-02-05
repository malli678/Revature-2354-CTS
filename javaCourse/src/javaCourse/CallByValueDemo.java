package javaCourse;

public class CallByValueDemo {

	public static void main(String[] args) {
		String name1 = "Test";
		String name2 = "Sample";
		System.out.println("In main function before calling swap" 
				+ "\n name1 = " + name1 + "\n name2 = " + name2);
		Swap(name1, name2);
		System.out.println("In main function After calling swap" 
				+ "\n name1 = " + name1 + "\n name2 = " + name2);
	}
	public static void Swap(String name1, String name2) {
		System.out.println("\n Swap method Before Swaping" 
				+ "\n Name1 = " + name1 + "\n Name2 = " + name2);
		String temp = name1;
		name1 = name2;
		name2 = temp;
		System.out.println("\n Swap method After Swaping" 
				+ "\n Name1 = " + name1 + "\n Name2 = " + name2);
	}

}
