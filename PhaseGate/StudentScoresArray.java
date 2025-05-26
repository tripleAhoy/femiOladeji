import java.util.Arrays;
public class StudentScoresArray{

	public static double[] toTotal(double[][] array) {
		double total = 0;
		for(double i = 0; i < array.length; i++) {
			total += array[i]; 
		}
		return total;
	}
	
	public static void main(String[] args) {
		double[][] array = {{3,3,4},{9,1,3}};

		System.out.print(Arrays.toString(toTotal(array)));
	}
}