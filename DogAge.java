import java.util.Scanner;

public class DogAge {

	public static void displayDogAge(String name, int humanYears) {
		int dogYears = humanYears * 7;
		System.out.printf("%s is %d years old in dog years", name, dogYears);
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter dog name: ");
		String name = input.next();

		System.out.print("Enter dog age: ");
		int humanYears = input.nextInt();

		displayDogAge(name, humanYears);
	}
}