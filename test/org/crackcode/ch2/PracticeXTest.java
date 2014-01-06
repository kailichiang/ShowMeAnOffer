package org.crackcode.ch2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PracticeXTest {
	MyLinkedList testList;
	
	@Test
	public void testFindMiddle() {
		setUp();
		System.out.println(testList);
		MyNode middle;
		middle = PracticeX.findMiddle(testList);
		System.out.println(middle);
	}
	
	public void setUp() {
		int[] testData = { 1, 2, 3, 4 };
		testList = new MyLinkedList();
		for (int value : testData) {
			testList.add(value);
		}
	}

}
