package madiator_singleton;

public class MediatorMain {

	public static void main(String[] args) {

		ChatMediator chatRoom = new ChatRoom();

		User user1 = new ConcreteUser("Anna", chatRoom);
		User user2 = new ConcreteUser("Ivan", chatRoom);
		User user3 = new ConcreteUser("Victoria", chatRoom);

		user1.sendMessage("Hi");
		user3.sendMessage("addBot");
		user1.sendMessage("I bought a cat yesterday");

	}

}
