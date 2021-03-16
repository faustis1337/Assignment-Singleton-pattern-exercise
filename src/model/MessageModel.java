package model;

import be.Message;
import bll.IMechaChatLogicFacade;
import bll.MessageChatFacade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MessageModel {
    private ObservableList<Message> messageObservableList;
    private IMechaChatLogicFacade iMechaChatLogicFacade;

    public MessageModel() {
        iMechaChatLogicFacade = new MessageChatFacade();
        messageObservableList = FXCollections.observableList(iMechaChatLogicFacade.getAllMessages());
    }

    public void sendMessage(String message) {
        iMechaChatLogicFacade.sendMessage(message);
        updateObesrvable();
    }

    private void updateObesrvable(){
        messageObservableList.clear();
        messageObservableList.addAll(iMechaChatLogicFacade.getAllMessages());
    }

    public ObservableList<Message> getMessageObservableList() {
        return messageObservableList;
    }
}
