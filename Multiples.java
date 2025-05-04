import java.util.Scanner;

public class Multiples {

	public static int findMultiple(int number) {
		return number * 5;
	}

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter integer: ");
	int number = input.nextInt();

	int result = findMultiple(number);

	System.out.printf("%d%n", result);
		
	}

}