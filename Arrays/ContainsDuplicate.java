package Interview.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {

	boolean containsDuplicate(int nums[]) {

		HashSet<Integer> set = new HashSet<>();

		for (int num : nums) {
			if (set.contains(num)) {
				return true;
			}
			set.add(num); //store the number if seen again its duplicate
		}
		return false;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 0, 5, 3, 6, 4 };

		ContainsDuplicate containsDuplicate = new ContainsDuplicate();
		boolean result = containsDuplicate.containsDuplicate(nums);
		System.out.println(result);

	}
}
