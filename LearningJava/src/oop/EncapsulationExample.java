package oop;

class Book {
	private String name;
	private String author;
	private int pages;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String author, int pages) {
		super();
		this.name = name;
		this.author = author;
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if (pages > 0) {
			this.pages = pages;
		} else {
			System.out.println("Pages numbers can not be negative..!");
		}
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", pages=" + pages + "]";
	}

}

public class EncapsulationExample {

	public static void main(String[] args) {
		Book book = new Book();
		book.setName("Java");
		book.setAuthor("James");
		book.setPages(1000);
//		book.setPages(-10);
		System.out.println(book);
		
		Book b=new Book("C", "Dennis", 450);
		System.out.println(b);
	}
}
