import java.util.*;

class Generator{
	public int[] generateRandomArray(){
		Random rand = new Random();
		int[] arr = new int[rand.nextInt(20)];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(20);
		}
		return arr;
	}
}
