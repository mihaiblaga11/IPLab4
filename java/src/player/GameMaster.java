package player;

import platform.lobby.Lobby;

public class GameMaster extends User {
    public GameMaster(String name, String surname, String email) {
        super(name, surname, email);
    }

    public void createLobbyInvite(Lobby lobby, User user) {}
    public void createRole() {}
    public void updateRole() {}
    public void deleteRole() {}
}
