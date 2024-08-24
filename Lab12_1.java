import java.util.Scanner;
public class Lab12_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		System.out.println("Sum of consecutive numbers from 1 to " + n + ": " + sumConsec(n));
		input.close();
	}
	
	public static int sumConsec(int n) {
		if (n == 0) return 0;
		return n + sumConsec(n - 1);
	}
}