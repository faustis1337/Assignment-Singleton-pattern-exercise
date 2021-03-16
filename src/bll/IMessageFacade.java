package bll;

import be.Message;

import java.util.List;

public interface IMessageFacade {

    void sendMessage(String message);

    List<Message> getAllMessages();

}
