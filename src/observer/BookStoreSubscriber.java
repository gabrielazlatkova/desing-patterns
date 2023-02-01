package observer;

public class BookStoreSubscriber implements Observer {
	private Observable book;
	private String firstName; 
	private String lastName;
	private String email;

	public BookStoreSubscriber(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName= lastName;
		
	}

	@Override
	public void update() {
		String newBook = this.book.getUpdate();
		if (newBook == null) {
			System.out.println("Does not have notification");
		}
		
		System.out.println(this.getFirstName()+ " " + this.getLastName() + this.getEmail() + " have new notification: " + newBook);
	}

	@Override
	public void setBookStore(Observable bookStore) {
		this.book = bookStore;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

}
