import java.util.Scanner;

public class DisplayAge {

	public static String displayAge(int ageYears) {
		int months = ageYears * 12;
		int days = ageYears * 365;
		int hours = days * 24;
		int minutes = hours * 60;
		int seconds = minutes * 60;

		return "Age in Years: " + ageYears +
			"\nAge in months: " + months +
			"\nAge in days: " + days +
			"\nAge in hours: " + hours +
			"\nAge in minutes: " + minutes +
			"\nAge in seconds: " + seconds;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter age: ");
		int ageYears = input.nextInt();

		System.out.println(displayAge(ageYears));
	}
}