package org.crackcode.ch2;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;

import org.junit.Test;

public class Practice2Test {

	MyLinkedList testList;

	@Test
	public void testNthToLast() {
		MyNode result;
		setUp();
		try {
			result = Practice2.nthToLast(testList, 3);
			assertEquals(1, result.data);
		} catch(Exception e){
			System.out.println(e);
		}
	}

	public void setUp() {
		int[] testData = { 1, 2, 3, 2, 8, 2, 4, 1, 6, 7 };
		testList = new MyLinkedList();
		for (int value : testData) {
			testList.add(value);
		}
	}
}
