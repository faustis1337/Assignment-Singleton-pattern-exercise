package bll;

import be.Message;
import dal.MessageDAO;

import java.util.List;

public class MessageManager {
    private MessageDAO messageDAO;

    public MessageManager() {
        messageDAO = new MessageDAO();
    }

    public void sendMessage(String message) {
        messageDAO.sendMessage(message);
    }

    public List<Message> getAllMessages() {
        return messageDAO.getAllMessages();
    }
}
