package gui;

import be.Message;
import bll.IMechaChatLogicFacade;
import bll.MessageChatFacade;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.MessageModel;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField messageField;
    public ListView<Message> messageList;

    private MessageModel messageModel;

    public Controller() {
        messageModel = new MessageModel();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        messageList.setItems(messageModel.getMessageObservableList());
    }

    public void sendMessageAction(ActionEvent actionEvent) {
        String message = messageField.getText();
        messageModel.sendMessage(message);
    }
}
