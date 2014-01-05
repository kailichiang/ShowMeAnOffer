package org.crackcode.ch1;

import java.util.HashSet;
import java.util.Set;

public class Practice7 {

	public static void fillZero(int [][] matrix) {
		int row = matrix.length;
		int column = matrix[0].length;
		Set<Integer> zeroRowSet = new HashSet<Integer>();
		Set<Integer> zeroColumnSet = new HashSet<Integer>();
		for(int i=0; i<row; ++i) {
			for(int j=0; j<column; ++j) {
				if (matrix[i][j] == 0) {
					zeroRowSet.add(i);
					zeroColumnSet.add(j);
				}
			}
		}
		for( int i : zeroRowSet) {
			for( int j=0; j<column; ++j) {
				matrix[i][j] = 0;
			}
		}
		for( int j : zeroColumnSet) {
			for( int i=0; i<row; ++i) {
				matrix[i][j] = 0;
			}
		}

	}
}
