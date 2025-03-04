package solutionhw4;

public class ChatServiceAdapter implements ChatService{
    private final LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService lcs){
        legacyChatService = lcs;
    }

    @Override
    public void sendMessage(String message) {
        legacyChatService.sendMessage(message);
    }
}
