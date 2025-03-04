package solutionhw4.adapter;

public class ChatServiceAdapter implements ChatService{
    private final LegacyChatService legacyChatService;

    // get LegacyChatService in constructor
    public ChatServiceAdapter(LegacyChatService lcs){
        legacyChatService = lcs;
    }

    // Override sendMessage method by Legacy method
    @Override
    public void sendMessage(String message) {
        legacyChatService.sendMessage(message);
    }
}
