package observer;

public class ObserverPatternMain {

	public static void main(String[] args) {
		BookStore bookStore = new BookStore();
		
		Observer firstObserver = new BookStoreSubscriber("John", "Smith");
		Observer secondObserver = new BookStoreSubscriber("Ana", "Hayes");
		Observer thirdObserver = new BookStoreSubscriber("Eva", "Walsh");
		
		bookStore.subscribe(firstObserver);
		bookStore.subscribe(secondObserver);
		bookStore.subscribe(thirdObserver);
		
		bookStore.setBookInformation("MySQL Stored Procedure Programming is now available!");
		bookStore.setBookInformation("Harry Potter Complete Book Series Special Edition is now on the sale!");
        bookStore.setBookInformation("Learning Tableau 10 - Second Edition is 10 % off!");
	}

}
