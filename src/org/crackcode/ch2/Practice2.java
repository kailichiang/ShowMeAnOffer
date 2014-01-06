package org.crackcode.ch2;

/*
 * to find the nth to last element of a singly linked list.
 */
public class Practice2 {
	public static MyNode nthToLast(MyLinkedList list, int n) throws Exception {
		if(list.head == null) {
			return null;
		}
		MyNode node1 = list.head;
		MyNode node2 = list.head;
		for(int i=0; i < n-1; ++i) {
			if(node2.getNext() == null) {
				throw new Exception("Linked list has less than " + n + " elements");
			}
			node2 = node2.getNext();
		}
		while(node2.getNext() != null) {
			node1 = node1.getNext();
			node2 = node2.getNext();
		}
		return node1;
	}
}
