package jp.learningdesign.javapractice;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[][] array = new int[3][2];
		array = new int[][] { { 1 } };

		System.out.println(Arrays.deepToString(array));

	}
}
