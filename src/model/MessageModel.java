package model;

import be.Message;
import bll.IMessageFacade;
import bll.MessageFacade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MessageModel {
    private ObservableList<Message> messageObservableList;
    private IMessageFacade iMessageFacade;

    public MessageModel() {
        iMessageFacade = MessageFacade.getInstance();
        messageObservableList = FXCollections.observableList(iMessageFacade.getAllMessages());
    }

    public void sendMessage(String message) {
        iMessageFacade.sendMessage(message);
        updateObesrvable();
    }

    private void updateObesrvable(){
        messageObservableList.clear();
        messageObservableList.addAll(iMessageFacade.getAllMessages());
    }

    public ObservableList<Message> getMessageObservableList() {
        return messageObservableList;
    }
}
