import java.util.*;

public class Test {
	public static void main(String args[]) {
		Solution sol = new Solution();
		Generator gen = new Generator();
		int[] arr = gen.generateRandomArray();
		System.out.println(Arrays.toString(arr));
		sol.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr2 = gen.generateRandomArray();
		System.out.println(Arrays.toString(arr2));
		sol.radixSort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}
