package platform.lobby;

import player.GameMaster;
import player.User;

import java.util.List;
import java.util.UUID;

public class Lobby {
    private UUID id;
    private List<User> players;

    protected Lobby(UUID id, GameMaster creator) {
        this.id = id;
        this.players.add(creator);
    }

    public void addPlayer(User user)
    {
        players.add(user);
    }

    public static Lobby Create(GameMaster user)
    {
        return new Lobby(UUID.randomUUID(), user);
    }
}
