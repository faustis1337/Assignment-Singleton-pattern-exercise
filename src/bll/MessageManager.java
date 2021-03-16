package bll;

import be.Message;
import dal.MessageDAO;

import java.util.List;

public class MessageManager {
    private static MessageManager instance;
    private MessageDAO messageDAO;

    private MessageManager() {
        messageDAO = new MessageDAO();
    }

    public void sendMessage(String message) {
        messageDAO.sendMessage(message);
    }

    public List<Message> getAllMessages() {
        return messageDAO.getAllMessages();
    }

    public static MessageManager getInstance() {
        if (instance == null) {
            instance = new MessageManager();
        }
        return instance;
    }
}
