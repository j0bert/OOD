package iterator;

import java.util.Arrays;
import java.util.Iterator;

public class UKBooks implements BookIterator{
	
	BookInfo[] bestBooks;
	
	int x = 0;
	
	public UKBooks(){
		
		bestBooks = new BookInfo[3];
		
		addBook("Pride and Predjudice", "Hugh Thomson", 1813);
		addBook("Vanity Fair", "William Thackery", 1847);
		addBook("A Clockwork Orange", "Anthony Burgess", 1962);
		
	}

	private void addBook(String bookName, String author, int year) {
		
		BookInfo info = new BookInfo(bookName, author, year);
		
		bestBooks[x] = info;
		x++;
		
	}
	
	public BookInfo[] getBestBooks(){
		return bestBooks;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(bestBooks).iterator();
	}
	
	

}
