package Interview;

public class PalindromNumber {

	public boolean isPalindrome(int x) {

		int org = x;
		int rev = 0;

		if (x < 0) {
			return false;
		}

		while (x != 0) {
			int num = x % 10;
			rev = rev * 10 + num;
			x = x / 10;
		}
		return org == rev;

	}

	public static void main(String[] args) {
		int num = 123211;
		PalindromNumber number = new PalindromNumber();
		Boolean res = number.isPalindrome(num);
		System.out.println(res);
	}

}
