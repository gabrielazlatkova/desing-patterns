package madiator_singleton;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
	private List<User> users;
	private ChatBot chatBot = null;

	public ChatRoom() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void sendMessage(String message, User user) {
		if (message.contains("addBot")) {
			chatBot = ChatBot.getInstance();
			user.addBotMessage(message);
		}
		for (User concreteUser : this.users) {
			if (concreteUser != user) {
				concreteUser.recieveMessage(message);
			}
		}
		checkMessage(message, user);

	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

	@Override
	public void checkMessage(String message, User user) {
		if (chatBot != null && chatBot.validatåÌessage(message)) {
			removeUser(user);
			user.removedUser(user);
			for (User concreteUser : this.users) {
				concreteUser.message(message, user);
			}

		}

	}

	@Override
	public void removeUser(User user) {
		this.users.remove(user);

	}

}
