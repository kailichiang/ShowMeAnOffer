package org.crackcode.ch2;

import java.util.HashSet;
import java.util.Set;

/**
 * 1. Write code to remove duplicates from an unsorted linked list. 2. How would
 * you solve this problem if a temporary buffer is not allowed? 
 * 
 * @author kaili
 * 
 */
public class Practice1 {

	public static void removeDup1(MyLinkedList list) {
		Set<Integer> mySet = new HashSet<Integer>();
		MyNode previous = null;
		MyNode node = list.head;
		while (node != null) {
			if (!mySet.add(node.getData())) {
				previous.setNext(node.getNext());
			} else {
				previous = node;
			}
			node = node.getNext();
		}
	}

	public static void removeDup2(MyLinkedList list) {
		if (list.head == null) {
			return;
		}
		MyNode previous = list.head;
		MyNode current = previous.next;

		while (current != null) {
			MyNode runner = list.head;
			while (runner != current) {
				if (runner.getData() == current.getData()) {
					previous.setNext(current.getNext());
					current = current.getNext();
					break;
				}
				runner = runner.getNext();
			}
			if (runner == current) {
				previous = current;
				current = current.getNext();
			}
		}
	}
}
