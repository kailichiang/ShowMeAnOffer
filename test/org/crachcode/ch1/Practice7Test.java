package org.crachcode.ch1;

import static org.junit.Assert.*;

import org.crackcode.ch1.Practice7;
import org.junit.Test;

public class Practice7Test {

	@Test
	public void testRotate() {
		int[][] testB = {{1,2,3,4},{5,0,7,8},{9,10,11,12},{13,14,15,0}};
		
		printMatrix(testB);
		Practice7.fillZero(testB);
		printMatrix(testB);
	}
	
	private void printMatrix(int[][] matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		for( int i=0; i<row; ++i) {
			for (int j = 0; j < column; j++) {
				System.out.format("%3d ", matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
