package Interview;

import java.util.Scanner;

public class PalindromicSubstrings {

	public int countSubstrings(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			count = expand(i, i, s) + count;
			count = expand(i, i + 1, s) + count;
		}

		return count;
	}

	public int expand(int left, int right, String s) {

		int count = 0;

		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

			count++;
			right++;
			left--;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check total Palindrom count");
		String s = sc.nextLine();
		PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();
		int result = palindromicSubstrings.countSubstrings(s);
		System.out.println(result);
	}

}
