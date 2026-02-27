package Interview.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public int lengthOfLongestSubstring(String s) {

		char[] a = s.toCharArray();
		int curr = a[0];
		int count = 0;

		for (int i = 0; i < a.length-1; i++) {
			if (curr != a[i] && a[i] != a[i + 1]) {
				curr=a[i];
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String s = "abcabcbb";

		Practice sum = new Practice();
		int res = sum.lengthOfLongestSubstring(s);
		System.out.println(res);
	}

}
