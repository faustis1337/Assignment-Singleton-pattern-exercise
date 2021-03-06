package gui;

import be.Message;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.MessageModel;

import java.net.URL;
import java.util.ResourceBundle;

public class MessageBoxController implements Initializable {
    public TextField messageField;
    public ListView<Message> messageList;

    private MessageModel messageModel;

    public MessageBoxController() {
        messageModel = new MessageModel();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        messageList.setItems(messageModel.getMessageObservableList());
    }

    public void sendMessageAction(ActionEvent actionEvent) {
        String message = messageField.getText();

        if(!message.isBlank()) {
            messageModel.sendMessage(message);
        }
    }
}
