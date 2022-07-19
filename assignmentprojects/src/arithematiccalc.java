import java.util.Scanner;

public class arithematiccalc {
	public static void main(String args[]) {
		int first, second, add, subtract, multiply, n;
		float division;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Two Numbers : ");
		first = sc.nextInt();
		second = sc.nextInt();
		System.out.println(
				"Enter 1 for addition.\nEnter 2 for substraction.\nEnter 3 for multiplication.\nEnter 4 for division.\n");
		n = sc.nextInt();
		add = first + second;
		subtract = first - second;
		multiply = first * second;
		division = (float) first / second;
		if (n == 1) {
			System.out.println("Sum = " + add);
		}
		if (n == 2) {
			System.out.println("Difference = " + subtract);
		}
		if (n == 3) {
			System.out.println("Multiplication = " + multiply);
		}
		if (n == 4) {
			System.out.println("Division = " + division);
		}

	}
}
