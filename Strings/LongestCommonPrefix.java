package Interview.Strings;

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {
			while (!strs[i].startsWith(prefix)) {

				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;
	}

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };

		LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
		String result = commonPrefix.longestCommonPrefix(strs);
		System.out.println(result);
	}

}
