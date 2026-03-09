package Interview;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {

		int n = nums.length;
		int[] dp = new int[n];

		int max = 1;

		Arrays.fill(dp, 1);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			max = Math.max(max, dp[i]);
		}

		return max;
	}

	public static void main(String[] args) {
		int nums[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
		LongestIncreasingSubsequence increasingSubsequence = new LongestIncreasingSubsequence();
		int result = increasingSubsequence.lengthOfLIS(nums);
		System.out.println(result);
	}

}
