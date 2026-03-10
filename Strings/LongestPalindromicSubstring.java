package Interview;

public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {

		if (s.length() < 1 || s == null) {
			return "";

		}

		int start = 0;
		int end = 0;

		for (int i = 0; i < s.length(); i++) {

			int length1 = expand(s, i, i); // for odd string center is same so i,i
			int length2 = expand(s, i, i + 1); // for even string center is two so i,i+1

			int finalLength = Math.max(length1, length2);

			if (finalLength > end - start) {

				start = i - (finalLength - 1) / 2;
				end = i + finalLength / 2;

			}

		}

		return s.substring(start, end + 1);
	}

	private int expand(String s, int left, int right) {

		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

			right++;
			left--;
		}
		return right - left - 1;

	}

	public static void main(String[] args) {
		String s = "babad";
		LongestPalindromicSubstring substring = new LongestPalindromicSubstring();
		String result = substring.longestPalindrome(s);
		System.out.println(result);

	}

}
