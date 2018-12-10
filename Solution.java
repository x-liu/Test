public class Solution {
	public void bubbleSort(int[] nums) {
		if (nums != null ) {
			for (int i = nums.length; i >= 0; i--) {
				for (int j = 1; j < i; j++) {
					if (nums[j] < nums[j-1]) {
						swap(nums, j, j-1);
					}
				}
			}
		}
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public void radixSort(int[] nums) {
		int nIntegers = 1;
		int len = nums.length;
		ListNode[] buckets = new ListNode[10];
		boolean hasMorePlaces = true;
		while (hasMorePlaces) {
			hasMorePlaces = false;
			int denom = (int) Math.pow(10, nIntegers++);
			for (int i = 0; i < nums.length; i++) {
				int currNum = nums[i];
				int remainder = currNum/denom;
				int nDigit = currNum%denom;
				if (nDigit >= 10) {
					nDigit = 0;
				}
				if (remainder > 0) {
					hasMorePlaces = true;
				}
				ListNode node = new ListNode(currNum);
				node.next = buckets[nDigit];
				buckets[nDigit] = node;
			}
			int index = 0;
			for (int i = 0; i < buckets.length; i++) {
				ListNode currNode = buckets[i];
				while (currNode != null) {
					nums[index++] = currNode.val;
					currNode = currNode.next;
				}
				buckets[i] = null;
			}
		}
	}	

}
