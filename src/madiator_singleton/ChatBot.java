package madiator_singleton;

public class ChatBot {

	private static ChatBot chatbot;

	private ChatBot() {
	}

	public static ChatBot getInstance() {

		if (chatbot == null) {
			chatbot = new ChatBot();
		}
		return chatbot;
	}
	
	public boolean validatåÌessage(String message) {
		boolean isCat = false;
		if (message.contains("cat")) {
			isCat = true;
		}
		return isCat;
	}
	

}
