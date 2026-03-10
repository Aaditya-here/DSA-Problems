package Interview.Strings;

import java.util.HashMap;

public class LengthOfLongestSubstring {

	public int lengthOfLongestSubstring(String s) {
		int left = 0;
		int maxLength = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);

			if (map.containsKey(c)) {
				left = Math.max(left, map.get(c) + 1);
			}
			map.put(c, right);

			maxLength = Math.max(maxLength, right-left);

		}

		return maxLength;

	}

	public static void main(String[] args) {
		String s = "abcabcbb";
		LengthOfLongestSubstring substring = new LengthOfLongestSubstring();
		int res = substring.lengthOfLongestSubstring(s);
		System.out.println(res);
	}

}
