package service.player;

import base.service.BaseService;
import model.Player;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PlayerService extends BaseService<Integer , Player> {
    public ArrayList<Player> listOfPlayer() throws SQLException;

    public ArrayList<String> getSeasonMaxPlayerSalary() throws SQLException;
}
