package Interview.Arrays;

import java.util.Scanner;

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (target == nums[mid]) {
				return mid;

			} else if (nums[mid] < target) {
				left = mid + 1;

			} else {
				right = mid - 1;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert target");
		int target = sc.nextInt();

		SearchInsertPosition insertPosition = new SearchInsertPosition();
		int result = insertPosition.searchInsert(nums, target);
		System.out.println(result);
	}
}
