package observer;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Observable {

	public List<Observer> observers;
	private String book;
	

	public BookStore() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setBookStore(this);

	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {

		return this.book;
	}

	public void setBookInformation(String book) {
		this.book = book;
		this.notifyObservers();
	}

}
