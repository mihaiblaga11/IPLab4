package platform.lobby;

import player.GameMaster;
import player.User;

import java.util.UUID;

public class PublicLobby extends Lobby {

    public PublicLobby(UUID id, GameMaster creator) {
        super(id, creator);
    }
}
