package madiator_singleton;

public class ConcreteUser extends User {

	public ConcreteUser(String username, ChatMediator chatMediator) {
		super(username, chatMediator);
		chatMediator.addUser(this);

	}

	@Override
	public void sendMessage(String message) {

		System.out.println(this.username + " send: " + message);
		this.chatMediator.sendMessage(message, this);

	}

	@Override
	public void recieveMessage(String message) {
		System.out.println(this.username + " recieve: " + message);

	}

	@Override
	public void addBotMessage(String message) {
		System.out.println(this.username + " add bot to the chat");

	}

	@Override
	public void removedUser(User user) {

		System.out.println(this.username + " was removed from the chat");
	}

	@Override
	public void message(String message, User user) {

		System.out.println(this.username + " recieve: The use of the word cat is forbidden in the chat!");
	}

}
