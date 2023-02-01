package madiator_singleton;

public interface ChatMediator {
	void addUser(User user);

	void checkMessage(String messages, User user);

	void sendMessage(String message, User user);

	void removeUser(User user);

}
