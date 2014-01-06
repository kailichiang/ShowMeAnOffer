package org.crackcode.ch2;

public class MyNode {
	int data;
	MyNode next;

	public MyNode(int data) {
		this.data = data;
		next = null;
	}

	public MyNode(int data, MyNode next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public String toString() {
		StringBuilder value = new StringBuilder();
		value.append(data);
		return value.toString() ;
	}
}
