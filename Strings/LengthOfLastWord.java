package Interview.Strings;

public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {

		int length = 0;
		int i = s.length() - 1;

		while (i >= 0 && s.charAt(i) == ' ') {
			i--;
		}

		while (i >= 0 && s.charAt(i) != ' ') {

			length++;
			i--;
		}

		return length;
	}

	public static void main(String[] args) {
		String s = "Hello world in java";
		LengthOfLastWord lastWord = new LengthOfLastWord();
		int result = lastWord.lengthOfLastWord(s);
		System.out.println(result);
	}
}
