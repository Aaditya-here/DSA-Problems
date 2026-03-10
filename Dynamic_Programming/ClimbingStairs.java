package Interview.Dynamic_Programming;

import java.util.Scanner;

public class ClimbingStairs {

	// here we have to climb stairs there are two ways 1)1-step 2)2-steps

	public int climbStairs(int n) {

		if (n <= 2)
			return n;

		int first = 1;
		int second = 2;

		for (int i = 3; i <= n; i++) {

			int third = first + second;

			first = second;
			second = third;

		}

		return second;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.stairs to climb");
		int n = sc.nextInt();
		ClimbingStairs climbingStairs = new ClimbingStairs();
		int result = climbingStairs.climbStairs(n);
		System.out.println(result);
	}

}
