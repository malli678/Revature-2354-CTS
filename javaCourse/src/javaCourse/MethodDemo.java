package javaCourse;

import java.util.Scanner;

public class MethodDemo {
	public void Addition() {
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number:");
		a = sc.nextInt();
		System.out.println("Enter the Second number:");
		b = sc.nextInt();
		sum = a + b;
		System.out.println("Total Sum:" + sum);
		sc.close();
	}
	
	// Example Method with args and without return
	public void Difference(int a, int b) {
		int difference = a - b;
		System.out.println("Difference = " + difference);
	}
	public static void main(String[] args) {
		MethodDemo cal = new MethodDemo();
		cal.Difference(200, 30);

	}

}
