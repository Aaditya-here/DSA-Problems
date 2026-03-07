package Interview.practice;

public class Practice {
	public void countVowels(String str) {

		int a = 0, e = 0, i = 0, o = 0, u = 0;

		for (int j = 0; j < str.length(); j++) {

			char ch = str.charAt(j);

			if (ch == 'a') {
				a++;
			} else if (ch == 'e') {
				e++;
			} else if (ch == 'i') {
				i++;
			} else if (ch == 'o') {
				o++;
			} else if (ch == 'u') {
				u++;
			}
		}
		int totalCount = a + e + i + o + u;
		System.out.println(totalCount);

		System.out.println("count is as follows");
		System.out.println("a " + a);
		System.out.println("e " + e);
		System.out.println("i " + i);
		System.out.println("o " + o);
		System.out.println("u " + u);

	}

	public static void main(String[] args) {
		Practice practice = new Practice();
		practice.countVowels("Aoday is a beautiful Day!");
	}
}
