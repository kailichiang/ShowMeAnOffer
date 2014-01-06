package org.crackcode.ch2;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class Practice1Test {

	MyList testList;
	Set<Integer> testSet;
	String listResult;
	@Test
	public void testRemoveDup1() {
		setUp();
		System.out.println(testList);
		Practice1.removeDup1(testList);
		assertTrue(listResult.toString().equals(testList.toString()));
		System.out.println(testList);
	}

	@Test
	public void testRemoveDup2() {
		setUp();
		System.out.println(testList);
		Practice1.removeDup2(testList);
		assertTrue(listResult.toString().equals(testList.toString()));
		System.out.println(testList);
	}

	public void setUp() {
		int [] testData = {1,2,3,2,8,2,4,1,6,7};
		testSet = new LinkedHashSet<Integer>();
		testList = new MyList();
		for( int value : testData) {
			testList.add(value);
			testSet.add(value);
		}
		
		StringBuilder result = new StringBuilder();
		for(int value : testSet) {
			result.append(value);
			result.append("->");
		}
		result.setLength(result.length() - 2);
		listResult = result.toString();
	}
}
