package Interview;

public class CharacterReplacement {

	public int characterReplacement(String s, int k) {
		int left = 0;
		int maxLen = 0;
		int maxFreq = 0;

		int[] freq = new int[26];

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			freq[c - 'A']++;

			maxFreq = Math.max(maxFreq, freq[c - 'A']);

			if ((right - left + 1) - maxFreq > k) {
				freq[s.charAt(left) - 'A']--;
				left++;
			}
			maxLen = Math.max(maxLen, right - left + 1);

		}
		return maxLen;
	}

	public static void main(String[] args) {
		CharacterReplacement replacement = new CharacterReplacement();
		String s = "ABAB";
		int res = replacement.characterReplacement(s, 2);
		System.out.println(res);

	}
}
