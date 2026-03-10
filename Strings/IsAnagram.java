package Interview.Strings;

public class IsAnagram {

	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		int[] freq = new int[26];

		for (int i = 0; i < s.length(); i++) {

			freq[s.charAt(i) - 'a']++;
			freq[t.charAt(i) - 'a']--;

		}
		for (int i : freq) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";

		IsAnagram anagram = new IsAnagram();
		boolean res = anagram.isAnagram(s, t);
		System.out.println(res);

	}
}
