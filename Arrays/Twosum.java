package Interview.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Twosum {

	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i <= nums.length - 1; i++) {
			int num = nums[i]; // puting number in array that visited
			if (map.containsKey(target - num)) { // checking num is present in array or not ie targrt-num

				return new int[] { i, map.get(target - num) }; // if present puting first number and target-that number
																// result
			}
			map.put(num, i);
		}

		return new int[] {};

	}

	public static void main(String[] args) {
		Twosum twosum = new Twosum();
		int nums[] = { 2, 7, 7, 2, 11, 15 }, target = 18;
		int[] result = twosum.twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
}
