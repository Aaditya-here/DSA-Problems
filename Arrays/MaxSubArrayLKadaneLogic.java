package Interview;

public class MaxSubArrayLKadaneLogic {

	/*
	 * Finding subarray which has maximum sum should be contageous(one after other)
	 */
	public int maxSubArray(int[] nums) {

		int currentSum = nums[0]; // at index 0 is maximum sum and current sum
		int maxSum = nums[0];

		for (int i = 1; i < nums.length; i++) { // starting at one becoz at 0 index is maxSum

			if (nums[i] > currentSum + nums[i]) { /*
													 * if current index is greater than current index number +current
													 * sum i.e index 0
													 */
				currentSum = nums[i]; // then update current sum= current number
			} else {
				currentSum = currentSum + nums[i];// else add that current number to current sum
			}

			if (currentSum > maxSum) { /*
										 * if current sum is greater than index 0 
										 * then update max sum*/
				maxSum = currentSum;
			}
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		MaxSubArrayLKadaneLogic maxSubArrayLKadaneLogic = new MaxSubArrayLKadaneLogic();
		int result = maxSubArrayLKadaneLogic.maxSubArray(nums);
		System.out.println((result));

	}

}
