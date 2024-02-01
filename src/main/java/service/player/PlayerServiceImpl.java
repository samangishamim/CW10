package service.player;

import base.service.BaseServiceImpl;
import model.Player;
import repository.player.PlayerRepository;

public class PlayerServiceImpl extends BaseServiceImpl<Integer , Player , PlayerRepository>
        implements PlayerService {
    public PlayerServiceImpl(PlayerRepository repository) {
        super(repository);
    }
}
