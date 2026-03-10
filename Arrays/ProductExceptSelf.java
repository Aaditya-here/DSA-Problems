package Interview.Arrays;

import java.util.Arrays;

public class ProductExceptSelf {

	int[] productExceptSelf(int[] nums) {

		/*
		 * we have to find product without division operator we can do here ANS=left
		 * Product*right product
		 */

		int n = nums.length;
		int answer[] = new int[n];

		// left Product
		answer[0] = 1;
		for (int i = 1; i < n; i++) {
			answer[i] = answer[i - 1] * nums[i - 1];
		}

		// Right Product
		int rightproduct = 1;
		for (int i = n - 1; i >= 0; i--) {
			answer[i] *= rightproduct;
			rightproduct *= nums[i];
		}

		return answer;

	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 9, 8 };
		ProductExceptSelf productExceptSelf = new ProductExceptSelf();
		int[] result = productExceptSelf.productExceptSelf(nums);
		System.out.println(Arrays.toString(result));

	}

}
