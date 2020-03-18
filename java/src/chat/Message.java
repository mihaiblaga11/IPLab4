package chat;

import player.User;

import java.util.Date;

public class Message {
    private String message;
    private User user;
    private Date date;

    public Message(String message, User user) {
        this.message = message;
        this.user = user;
        this.date = new Date();
    }


    public Date getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public String getMessage() {
        return message;
    }
}
