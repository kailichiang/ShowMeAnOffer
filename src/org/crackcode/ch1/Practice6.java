package org.crackcode.ch1;

public class Practice6 {

	public static void rotate(int[][] matrix, int n) {
		int loop = n/2;
		for (int i = 0; i < loop; ++i) {
			int start = i;
			int end = n - 1 - i;

			for (int j = start; j < end; ++j) {
				int offset = j - start;
				int temp = matrix[start][j];
				// move left to top
				// (n,0), (n-1,0), (n-2,0)
				matrix[start][j] = matrix[end - offset][start];
				// move bottom to left
				// (n,0),(n,1),(n,2)
				matrix[end - offset][start] = matrix[end][end - offset];
				// move right to bottom
				// (n,n),(n,n-1),(n,n-2)
				matrix[end][end - offset] = matrix[j][end];
				// move top to right
				matrix[j][end] = temp;
			}
		}
	}
}
