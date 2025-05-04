public class  DisplayPrime {

	public static boolean isPrime(int number) {
		if (number <= 1) return false;
		if (number == 2) return true;
		if (number % 2 == 0) return false;

		for(int i = 3; i * i <= number; i += 2) {
			if(number % i == 0) return false;
		}
	return true;
	}

	public static int  displayPrimeNumbers() {
		int count = 0;
		int number = 2;
		
		while(count < 50) {
			if (isPrime(number)) {
			System.out.print(number + " ");
			count++;
			}
		number++;
		}
	}

	public static void main(String[] args) {
		System.out.println("Print the first 50 prime numbers: ");
			displayPrimeNumbers();
	}

}