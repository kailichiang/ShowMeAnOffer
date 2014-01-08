package org.crackcode.ch2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Practice4Test {

	MyLinkedList list1;
	MyLinkedList list2;
	
	@Test
	public void testAddList() {
		setUp();
		MyLinkedList result = Practice4.addList(list1, list2);
		System.out.println("ans:  " + result);
		
	}

	@Test
	public void testAddList2() {
		setUp();
		MyLinkedList result = Practice4.addList2(list1, list2);
		System.out.println("ans:  " + result);		
	}

	public void setUp() {
		int [] data1 = {7,1,9, 3, 4, 5};
		int [] data2 = {5,9,2}; 
		list1 = new MyLinkedList();
		list2 = new MyLinkedList();
		for(int data : data1) {
			list1.add(data);
		}
		for(int data : data2) {
			list2.add(data);
		}
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
	}
}
