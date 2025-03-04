package solutionhw4.adapter;

public class ChatAdapterDemo {
    public static void main(String[] args) {
        // show that both work clearly
        LegacyChatService legacyChatService = new LegacyChatService();
        legacyChatService.sendMessage("legacy message");
        ChatServiceAdapter chatServiceAdapter = new ChatServiceAdapter(legacyChatService);
        chatServiceAdapter.sendMessage("adapter message");
    }
}
