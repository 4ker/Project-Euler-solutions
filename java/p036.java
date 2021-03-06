/* 
 * Solution to Project Euler problem 36
 * Copyright (c) Project Nayuki. All rights reserved.
 * 
 * https://www.nayuki.io/page/project-euler-solutions
 * https://github.com/nayuki/Project-Euler-solutions
 */


public final class p036 implements EulerSolution {
	
	public static void main(String[] args) {
		System.out.println(new p036().run());
	}
	
	
	public String run() {
		long sum = 0;
		for (int i = 1; i < 1000000; i++) {
			if (Library.isPalindrome(Integer.toString(i, 10)) && Library.isPalindrome(Integer.toString(i, 2)))
				sum += i;
		}
		return Long.toString(sum);
	}
	
}
