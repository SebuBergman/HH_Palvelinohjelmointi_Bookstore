package hh.swd20.Bookstore.domain;

public class Bookstore {
	
	private String title;
	private String author;
	private int year;
	private int isbn;
	private int price;
	
	public Bookstore(String title, String author, int year, int isbn, int price) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}

	public Bookstore() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public int getIsbn() {
		return isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bookstore [title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price="
				+ price + "]";
	}
}
