package platform;

import sun.security.util.Password;

import java.util.List;
import java.util.UUID;

public class Platform {
    private int numberOfPlayers;
    private List<Server> serverList;

    public Platform(int numberOfPlayers, List<Server> serverList) {
        this.numberOfPlayers = numberOfPlayers;
        this.serverList = serverList;
    }

    public boolean login(String name, Password password)
    {
        return false;
    }

    public boolean register(String name, String surname, Password password, String email)
    {
        return false;
    }

    public Server chooseServer(UUID serverId)
    {
        return serverList.stream()
                .filter(x -> x.getId() == serverId)
                .findFirst()
                .orElse(null);
    }
}
