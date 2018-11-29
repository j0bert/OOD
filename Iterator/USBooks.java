package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class USBooks implements BookIterator{
	
	ArrayList<BookInfo> bestBooks;
	
	public USBooks(){
		
		bestBooks = new ArrayList<BookInfo>();
		
		addBook("The Scarlet Letter", "Nathaniel Hawthorne", 1850);
		addBook("Uncle Tom's Cabin", "Harriet Beecher Stowe", 1853);
		addBook("Of Mice and Men", "John Steinbeck", 1937);

	}
	
	public void addBook(String bookName, String author, int year) {
		
		BookInfo bookinfo = new BookInfo(bookName, author, year);
		
		bestBooks.add(bookinfo);
		
	}

	public ArrayList<BookInfo> getBestBooks(){
		return bestBooks;
	}


	public Iterator createIterator() {
		return bestBooks.iterator();
	}

}
