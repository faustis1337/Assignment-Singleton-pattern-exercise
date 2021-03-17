package dal;

import be.Message;

import java.util.List;

public interface IMessageDAO {

    public List<Message> getAllMessages();

    public void sendMessage(String message);

}
