package Interview;

public class MaxProduct {

	public int maxProduct(int[] nums) {

		int maxProduct = nums[0];
		int minProduct = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int current = nums[i];
			// for negatice interger check becoz negative*negative=positive
			if (current < 0) {
				int temp = maxProduct;
				maxProduct = minProduct;
				minProduct = temp;
			}
			if (current > maxProduct * current) {
				maxProduct = current;
			} else {
				maxProduct = maxProduct * current;

			}
			if (current < minProduct * current) {
				minProduct = current;
			} else {
				minProduct = minProduct * current;
			}
			if (maxProduct > result) {
				result = maxProduct;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, -2, 4 };
		MaxProduct maxProduct = new MaxProduct();
		int result = maxProduct.maxProduct(nums);
		System.out.println(result);

	}

}
