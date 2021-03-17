package dal.db;

import be.Message;
import dal.IMessageDAO;
import dal.db.DatabaseConnector;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MessageDB implements IMessageDAO {
    private DatabaseConnector databaseConnector;

    public MessageDB() {
        databaseConnector = new DatabaseConnector();
    }

    public List<Message> getAllMessages() {
        List<Message> messages = new ArrayList<>();
        try (Connection connection = databaseConnector.getConnection()) {
            String sql = "Select * FROM Message";
            Statement statement = connection.createStatement();
            if (statement.execute(sql)) {
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    Message message = new Message(resultSet.getString("Text"), resultSet.getInt("ID"));
                    messages.add(message);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return messages;
    }


    public void sendMessage(String message) {
        try (Connection connection = databaseConnector.getConnection()) {
            String sql = "INSERT INTO [Message] Values (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, message);
            preparedStatement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
