package repository.player;

import base.repository.BaseRepository;
import model.Player;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PlayerRepository extends BaseRepository<Integer , Player> {

    public ArrayList<Player> listOfPlayer() throws SQLException;

    public String getSeasonMaxPlayerSalary();
}
