package service.player;

import base.service.BaseServiceImpl;
import model.Player;
import repository.player.PlayerRepository;

import java.sql.SQLException;
import java.util.ArrayList;

public class PlayerServiceImpl extends BaseServiceImpl<Integer , Player , PlayerRepository>
        implements PlayerService {
    public PlayerServiceImpl(PlayerRepository repository) {
        super(repository);
    }

    @Override
    public ArrayList<Player> listOfPlayer() throws SQLException {
        return repository.listOfPlayer();
    }
}
