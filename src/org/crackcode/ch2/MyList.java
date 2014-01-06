package org.crackcode.ch2;


public class MyList {
	MyNode head;
	MyNode tail;

	public MyList() {
		head = null;
		tail = null;
	}
	public void add(int value) {
		MyNode node = new MyNode(value);
		if(head == null) {
			head = node;
		} else {
			tail.setNext(node);
		}
		tail = node;
	}

	public String toString() {
		MyNode current = head;
		StringBuilder values = new StringBuilder();
		while(current != null) {
			values.append(current);
			current = current.next;
			if(current != null) {
				values.append("->");
			}
		}
		return values.toString();
	}
}