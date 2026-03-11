package Interview.Arrays;

public class ReverseInteger {

	public int reverse(int x) {

		int rev = 0;

		while (x != 0) {
			int temp = x % 10;

			if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
				return 0;
			}

			rev = rev * 10 + temp;
			x = x / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int x = -123;
		ReverseInteger integer = new ReverseInteger();
		int result = integer.reverse(x);
		System.out.println(result);

	}

}
