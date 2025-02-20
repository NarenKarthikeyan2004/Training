class Book {
	public static void main(String[] args) {
		Book myBook = new Book();
		myBook.displayDetails();
	}
	private String title;
	private double price;
	public Book() {
		this.title = "Java Programming";
		this.price = 100.0;
	}
	public void displayDetails() {
		System.out.println("Book Title: " + title);
		System.out.println("Book Price: " + price);
	}
}