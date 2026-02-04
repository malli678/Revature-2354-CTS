
public class ExceptionDemo {

	public static void main(String[] args) {
		//ArithmeticException
//		try {
//			int a = 10;
//			int b = 0;
//			int c = a / b;
//		} catch (ArithmeticException e) {
//			System.out.println("Cannot divisible by zero.");
//		}
		//NullPointerException
//		try {
//			String name = null;
//			System.out.println(name.length()); //Error
//		} catch (NullPointerException e) {
//			System.out.println("customer name is missing (null).");
//		}
		//ArrayIndexOutOfBoundsException
//		try {
//			int arr[] = { 1, 2, 3, 4};
//			System.out.println(arr[5]); // Invalid Index
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Invalid index selected.");
//		}
		//NumberFormatException
		try {
			String ageText = "Ten";
			int age = Integer.parseInt(ageText);
			System.out.println("Age: " + age);
		} catch (NumberFormatException e) {
			System.out.println("Please enter age as a number only.");
		}
	}

}
