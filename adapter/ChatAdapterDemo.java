package solutionhw4;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChatService = new LegacyChatService();
        legacyChatService.sendMessage("legacy message");
        ChatServiceAdapter chatServiceAdapter = new ChatServiceAdapter(legacyChatService);
        chatServiceAdapter.sendMessage("adapter message");
    }
}
