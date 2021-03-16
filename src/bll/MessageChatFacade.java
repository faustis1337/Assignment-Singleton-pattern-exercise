package bll;

import be.Message;

import java.util.List;

public class MessageChatFacade implements IMechaChatLogicFacade {
    private MessageManager messageManager = MessageManager.getInstance();

    @Override
    public void sendMessage(String message) {
        messageManager.sendMessage(message);
    }

    @Override
    public List<Message> getAllMessages() {
        return messageManager.getAllMessages();
    }

}
