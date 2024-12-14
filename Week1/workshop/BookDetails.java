package workshop;

class Book{
	String title;
	String author;
	int year;
	
	Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Book[title = " + title + ", author = " + author + ", year = " + year + "]";
	}
}

public class BookDetails {

	public static void main(String[] args) {
		Book book1 = new Book("Head_First_Java_Second_Edition", "Bert Bates", 2080);
		System.out.println(book1.toString());
	}

}
