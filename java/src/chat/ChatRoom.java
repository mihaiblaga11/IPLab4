package chat;

import player.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChatRoom {
    private UUID id;
    private List<User> connectedUsers;
    private List<Message> messages;

    public ChatRoom() {
        this.id = UUID.randomUUID();
        connectedUsers = new ArrayList<>();
        messages = new ArrayList<>();
    }
    public UUID getId() {
        return id;
    }

    public List<User> getConnectedUsers() {
        return connectedUsers;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void addUser(User u)
    {
        connectedUsers.add(u);
    }

    public void removeUser(User u)
    {
        connectedUsers.remove(u);
    }

    public void addMessage(Message message)
    {
        messages.add(message);
    }
}
