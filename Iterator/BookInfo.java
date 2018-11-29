package iterator;

public class BookInfo {
	
	String bookName;
	String author;
	int publishYear;
	
	public BookInfo(String newBookName, String newAuthor, int newPublishYear){
		
		bookName = newBookName;
		author = newAuthor;
		publishYear = newPublishYear;
		
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public int getPublishYear() {
		return publishYear;
	}

}
