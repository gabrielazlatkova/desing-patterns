package madiator_singleton;

public abstract class User {

	protected String username;
	protected ChatMediator chatMediator;
	protected ChatBot chatbot;

	public User(String username, ChatMediator chatMediator) {
		this.username = username;
		this.chatMediator = chatMediator;
		this.chatbot = ChatBot.getInstance();

	}

	public abstract void sendMessage(String message);

	public abstract void recieveMessage(String message);

	public abstract void addBotMessage(String message);

	public abstract void removedUser(User username);

	public abstract void message(String message,User user);

	
	
}
