package z_31_next_permutation;

public class Solution {
	public void nextPermutation(int[] nums) {
		int len = nums.length;
		if(len < 2) return;
		int j = len - 1;
		while(j > 0){
			if(nums[j] > nums[j - 1]) break;
			j--;
		}
		if(j == 0) sort(nums, 0, len - 1);
		else{
			int k = len - 1;
			while(k > j){
				if(nums[k] > nums[j - 1]){
					swap(nums, j-1, k);
					sort(nums, j, len - 1);
					return;
				}
				k--;
			}
		}
    }
	
	public void swap(int[] array, int start, int end){
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
	}
	public void sort(int[] array, int head, int tail){
		if(head > tail) return;
		for(int i = head; i < head + (tail - head)/2 + 1; i++){
			swap(array, i, tail + head - i);
		}
	}

}
