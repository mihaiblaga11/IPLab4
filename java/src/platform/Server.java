package platform;

import chat.ChatRoom;

import java.util.UUID;

public class Server {
    private UUID id;
    private String name;
    private int maxPlayers;
    private ChatRoom chatRoom;

    public Server(UUID id, String name, int maxPlayers) {
        this.id = id;
        this.name = name;
        this.maxPlayers = maxPlayers;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }
}
