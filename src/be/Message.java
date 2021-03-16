package be;

public class Message {
    private String message;
    private int id;

    public Message(String message, int id) {
        this.message = message;
        this.id = id;
    }

    @Override
    public String toString() {
        return message;
    }
}
