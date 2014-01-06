package org.crackcode.ch2;

/*
 * to find the middle value of a singly linked list
 */
public class PracticeX {

	public static MyNode findMiddle(MyLinkedList list) {
		MyNode node1 = list.head;
		MyNode node2 = list.head;
		while((node2.getNext()!=null)
				&& (node2.getNext().getNext()!=null)) {
			node1 = node1.getNext();
			node2 = node2.getNext().getNext();
		}
		// if node2.getNext() != null && node2.getNext() == null => even elements
		// the middle is between node1 and node1.getNext();
		return node1;
	}
}
