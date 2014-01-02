package org.totalbeginner.tutorial;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class MyLibraryTest {

	private Book b1;
	private Book b2;
	private Person p1;
	private Person p2;
	private MyLibrary ml;

	@Test
	public void testMyLibrary() {
		MyLibrary ml = new MyLibrary("Test");
		assertEquals("Test", ml.name);
		assertTrue(ml.books instanceof ArrayList);
		assertTrue(ml.people instanceof ArrayList);
	}
	
	public void setup() {
		b1 = new Book("Book1");
		b2 = new Book("Book2");
		
		p1 = new Person();
		p2 = new Person();
		
		p1.setName("Fred");
		p2.setName("Sue");
		
		ml = new MyLibrary("Test");
		
	}
	
	@Test
	public void testAddBook() {
		setup();
		
		assertEquals(0, ml.getBooks().size());
		
		ml.addBook(b1);
		ml.addBook(b2);
		
		assertEquals(2, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b1));
		assertEquals(1, ml.getBooks().indexOf(b2));
		
		ml.removeBook(b1);
		assertEquals(1, ml.getBooks().size());
		assertEquals(0, ml.getBooks().indexOf(b2));
	}		
	@Test
	public void testCheckOut() {
		setup();
		addItems();
		
		assertTrue("Book did not check out correctly", 
				ml.checkOut(b1, p1));
		assertEquals("Fred", b1.getPerson().getName());
		
		assertFalse("Book was already checked out",
				ml.checkOut(b1,p2));
		assertTrue("Book check in failed", ml.checkIn(b1));
		assertFalse("Book is already checked in", ml.checkIn(b1));
		
		setup();
		p1.setMaximumBooks(1);
		addItems();
		
		assertTrue("First book do not check out", 
				ml.checkOut(b2,p1));
		assertFalse("Second book should not have checked out",
				ml.checkOut(b1,p1));
	}

	private void addItems() {
		ml.addBook(b1);
		ml.addBook(b2);
		ml.addPerson(p1);
		ml.addPerson(p2);
	}
	
	@Test
	public void testGetBooksForPerson() {
		setup();
		addItems();
		assertEquals(0, ml.getBooksForPerson(p1).size());
		
		ml.checkOut(b1, p1);
		ArrayList<Book> testBooks = ml.getBooksForPerson(p1);
		assertEquals(1, testBooks.size());
		assertEquals(0, testBooks.indexOf(b1));
		
		ml.checkOut(b2,p1);
		testBooks = ml.getBooksForPerson(p1);
		assertEquals(2, testBooks.size());
		assertEquals(1, testBooks.indexOf(b2));
	}
	
	@Test
	public void testGetAvailableBooks() {
		setup();
		addItems();
		ArrayList<Book> testBooks = ml.getAvailableBooks();
		assertEquals(2, testBooks.size());
		assertEquals(1, testBooks.indexOf(b2));
		
		ml.checkOut(b1, p1);
		testBooks = ml.getAvailableBooks();
		assertEquals(1, testBooks.size());
		assertEquals(0, testBooks.indexOf(b2));
		
		ml.checkOut(b2,p1);
		testBooks = ml.getAvailableBooks();
		assertEquals(0, testBooks.size());

	}

	@Test
	public void testGetUnavailableBooks() {
		setup();
		addItems();
		assertEquals(0, ml.getUnavailableBooks().size());
		
		ml.checkOut(b1, p1);
		ArrayList<Book> testBooks = ml.getUnavailableBooks();
		assertEquals(1, testBooks.size());
		assertEquals(0, testBooks.indexOf(b1));
		
		ml.checkOut(b2,p2);
		testBooks = ml.getUnavailableBooks();
		assertEquals(2, testBooks.size());
		assertEquals(1, testBooks.indexOf(b2));
	}

	@Test
	public void testToString() {
		setup();
		addItems();
		assertEquals("Test: 2 books; 2 people.", ml.toString());
	}
}
