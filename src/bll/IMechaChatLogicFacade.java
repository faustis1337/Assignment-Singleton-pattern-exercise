package bll;

import be.Message;

import java.util.List;

public interface IMechaChatLogicFacade {
    void sendMessage(String message);

    List<Message> getAllMessages();

}
