package org.crackcode.ch2;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a circular linked list, to find the node at the beginning of the loop.
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a nodeÕs next
 * pointer points to an earlier node, so as to make a loop in the linked list.
 * EXAMPLE
 * input: A -> B -> C -> D -> E -> C [the same C as earlier]
 * output: C
 */
public class Practice5 {

	public static MyNode findCirculationHead(MyLinkedList list) {
		MyNode node = list.head;
		Set<MyNode> nodeSet = new HashSet<MyNode>();
		while(node != null) {
			if( !nodeSet.add(node) ) {
				break;
			}
			node = node.getNext();
		}
		if(node == null) {
			return null; // no circulation
		} else {
			return node;
		}
		/*
		MyNode p1 = list.head;
		MyNode p2 = list.head;
		while( p2.getNext() != null ) {
			p1 = p1.getNext();
			p2 = p2.getNext().getNext();
			if( p1 == p2 ) {
				break;
			}
		}
		MyNode beginning;
		
		return beginning;
		*/
	}

	public static MyNode findCirculationHead2(MyLinkedList list) {
		MyNode p1 = list.head;
		MyNode p2 = list.head;
		while( (p2 != null) && (p2.getNext() != null) ) {
			p1 = p1.getNext();
			p2 = p2.getNext().getNext();
			if( p1 == p2 ) {
				break;
			}
		}
		if( p2 == null) {
			return null;
		}
		
		p1 = list.head;
		while( p1 != p2) {
			p1 = p1.getNext();
			p2 = p2.getNext().getNext();			
		}
		return p1;
	}

}
