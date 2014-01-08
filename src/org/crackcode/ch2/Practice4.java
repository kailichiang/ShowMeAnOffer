package org.crackcode.ch2;
/**
 * two numbers represented by a linked list, where each node contains a single
 *  digit. The digits are stored in reverse order, such that the 1Õs digit is
 *  at the head of the list. Write a function that adds the two numbers and
 *  returns the sum as a linked list.
 *  EXAMPLE:
 *  Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 *  Output: 8 -> 0 -> 8
 *
 */
public class Practice4 {

	public static MyLinkedList addList(MyLinkedList list1, MyLinkedList list2) {
		MyNode x1 = list1.head;
		MyNode x2 = list2.head;
		MyLinkedList result = new MyLinkedList();
		int carry = 0;
		while( (x1 != null) || (x2 != null) ) {
			int value = carry;
			if ( x1 != null ) {
				value += x1.getData();
				x1 = x1.getNext();
			}
			if ( x2 != null ) {
				value += x2.getData();
				x2 = x2.getNext();
			}			
			carry = value / 10;
			value = value % 10;
			result.add(value);
		}
		if(carry > 0) {
			result.add(carry);
		}
		return result;
	}

	private static MyNode addNode(MyNode n1, MyNode n2, int carry) {
		MyNode result;
		if( (n1 == null) && (n2 == null) ) {
			if ( carry > 0) {
				result = new MyNode(carry);
				return result;
			} else {
				return null;
			}
		}
		
		int value = carry;
		if( n1!= null ) {
			value += n1.getData();
			n1 = n1.getNext();
		}
		if( n2!= null ) {
			value += n2.getData();
			n2 = n2.getNext();
		}

		result = new MyNode(value%10);
		
		MyNode next = addNode(n1, n2, value/10);
		result.setNext(next);
		
		return result;
	}
	public static MyLinkedList addList2(MyLinkedList list1, MyLinkedList list2) {
		MyNode x1 = list1.head;
		MyNode x2 = list2.head;
		MyLinkedList result = new MyLinkedList();
		result.head = addNode(x1, x2, 0);
		return result;
	}
}
