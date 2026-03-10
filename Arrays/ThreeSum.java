package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;

			int sum = nums[i] + nums[left] + nums[right];

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			while (left < right) {
				sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					list.add(Arrays.asList(nums[i], nums[left], nums[right]));

					while (left < right && nums[left] == nums[left + 1]) {
						left++;
					}
					
					while (left < right && nums[right] == nums[right - 1]) {
						right--;
					}

					left++;
					right--;

				} else if (sum < 0) {
					left++;

				} else {
					right--;
				}
			}
		}

		return list;

	}

	public static void main(String[] args) {
		int nums[] = {-1,0,1,2,-1,-4 };

		ThreeSum sum = new ThreeSum();
		List<List<Integer>> res = sum.threeSum(nums);
		System.out.println(res);
	}

}
