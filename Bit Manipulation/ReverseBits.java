package Interview;

public class ReverseBits {

	public int reverseBits(int n) {

		int result = 0;

		for (int i = 0; i < 32; i++) {

			result = result << 1; // make space

			result = result | (n & 1); // add last bit

			n = n >> 1; // move to next bit
		}

		return result;
	}

	public static void main(String[] args) {
		int n = 43261596;
		ReverseBits reverseBits = new ReverseBits();
		int result = reverseBits.reverseBits(n);
		System.out.println(result);
	}

}
