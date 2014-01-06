package org.crackcode.ch1;

import static org.junit.Assert.*;

import org.crackcode.ch1.Practice6;
import org.junit.Test;

public class Practice6Test {

	@Test
	public void testRotate() {
		int[][] testA = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] testB = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		printMatrix(testA, 3);
//		Practice6.rotate(testA, 3);
//		printMatrix(testA, 3);
		
		printMatrix(testB, 4);
		Practice6.rotate(testB, 4);
		printMatrix(testB, 4);
	}
	
	private void printMatrix(int[][] matrix, int n) {
		for( int i=0; i<n; ++i) {
			System.out.format("%3d %3d %3d %3d\n", 
					matrix[i][0], matrix[i][1], matrix[i][2], matrix[i][3]);
		}
		System.out.println("\n");
	}

}
