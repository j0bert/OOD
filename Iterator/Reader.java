package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Reader {
	
	USBooks usBooks;
	UKBooks ukBooks;
	
	BookIterator usBookIter;
	BookIterator ukBookIter;
	
	public Reader(BookIterator BI1, BookIterator BI2){
		
		usBookIter = BI1;
		ukBookIter = BI2;
		
	}

	
	public void showBooks(){
		
		Iterator US = usBookIter.createIterator();
		Iterator UK = ukBookIter.createIterator();
		
		System.out.println("Best US Books:");
		printTheBooks(US);
		System.out.println("Best UK Books:");
		printTheBooks(UK);
		
	}


	private void printTheBooks(Iterator uK) {
		
		while (uK.hasNext()){
			BookInfo bookInfo = (BookInfo) uK.next();
			
			System.out.println(bookInfo.bookName);
			System.out.println(bookInfo.author);
			System.out.println(bookInfo.publishYear);
			
		}
		
	}

}
