package iterator;

public class Main {

	public static void main(String[] args) {
		
		USBooks usBooks = new USBooks();
		UKBooks ukBooks = new UKBooks();
		
		Reader read = new Reader(usBooks, ukBooks);
		
		read.showBooks();
		
	}

}
