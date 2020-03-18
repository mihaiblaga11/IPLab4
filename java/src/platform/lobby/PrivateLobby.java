package platform.lobby;

import player.GameMaster;
import player.User;

import java.util.UUID;

public class PrivateLobby extends Lobby {
    protected PrivateLobby(UUID id, GameMaster creator) {
        super(id, creator);
    }
}
