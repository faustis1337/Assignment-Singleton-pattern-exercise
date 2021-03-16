package bll;

import be.Message;
import dal.MessageDAO;

import java.util.List;

public class MessageFacade implements IMessageFacade {
    private static MessageFacade instance;
    private MessageDAO messageDAO;

    private MessageFacade() {
        messageDAO = new MessageDAO();
    }

    public void sendMessage(String message) {
        messageDAO.sendMessage(message);
    }

    public List<Message> getAllMessages() {
        return messageDAO.getAllMessages();
    }

    public static MessageFacade getInstance() {
        if (instance == null) {
            instance = new MessageFacade();
        }
        return instance;
    }
}
