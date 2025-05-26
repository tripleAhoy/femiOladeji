import java.util.Arrays;

public class SquareSorting{

	public static int[] squareSort(int[] array) {

		for(int index = 0; index < array.length; index++) {
			int currentMin = array[index];
			int currentMinIndex = index;
			
			for(int count = index + 1; count < array.length; count++) {
				if(currentMin > array[count]) {
					currentMin = array[count];
					currentMinIndex = count;
				}
			}

			if(currentMinIndex != index) {
				array[currentMinIndex] = array[index];
				array[index] = currentMin;
			}

		}


		for(int i = 0; i < array.length; i++) {
			array[i] *= array[i];
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = {9, 2, 7, 0, 5};

		System.out.print(Arrays.toString(squareSort(array)));	
	}


}