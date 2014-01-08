package org.crackcode.ch2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Practice5Test {

	MyLinkedList list;
	
	public void setUp() {
		// 1->3->5->7->2->4->7
		list = new MyLinkedList();
		int [] data = {1,3,5,7,2,4};
		for(int value : data) {
			MyNode node = new MyNode(value);
			list.add(node);
		}
	}
	
	@Test
	public void testFindCirculationHead() {
		MyNode knot;
		
		setUp();
		knot = Practice5.findCirculationHead(list);
		assertEquals(null, knot);
		
		setUp();
		list.tail.setNext(list.head.getNext().getNext().getNext());
		knot = Practice5.findCirculationHead(list);
		assertEquals(7, knot.getData());
	}
	
	@Test
	public void testFindCirculationHead2() {
		MyNode knot;
		
		setUp();
		knot = Practice5.findCirculationHead2(list);
		assertEquals(null, knot);
		
		setUp();
		list.tail.setNext(list.head.getNext().getNext().getNext());
		knot = Practice5.findCirculationHead2(list);
		assertEquals(7, knot.getData());
	}
}
