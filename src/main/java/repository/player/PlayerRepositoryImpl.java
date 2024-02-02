package repository.player;

import base.repository.BaseRepositoryImpl;
import model.Player;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public class PlayerRepositoryImpl extends BaseRepositoryImpl<Integer, Player>
        implements PlayerRepository {
    public PlayerRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return "player";
    }

    @Override
    public String getFieldName() {
        return "(player_name , team_id , contract_id)";
    }

    @Override
    public String getQuestionMarks() {
        return "(?,?,?)";
    }

    @Override
    public String getUpdateFields() {
        return "player_name = ? , team_id = ? , contract_id = ? ";
    }

    @Override
    public void setFields(PreparedStatement ps, Player entity, boolean isCountOnly) throws SQLException {
        ps.setString(1, entity.getPlayerName());
        ps.setInt(2, entity.getTeamId());
        ps.setInt(3,entity.getContract_id());
    }

    @Override
    public Player mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        String playerName = resultSet.getString(2);
        int team_id = resultSet.getInt(3);
        int contractId = resultSet.getInt(4);
        return new Player(id, playerName,team_id,contractId);
    }

    @Override
    public ArrayList<Player> listOfPlayer() throws SQLException {
        //todo SELECT  * FROM player ;
        String sql = "SELECT * FROM player";
        try (PreparedStatement ps = connection.prepareStatement(sql,
                ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            ResultSet resultSet = ps.executeQuery();

            ArrayList<Player> playerList = new ArrayList<>();
            while (resultSet.next()) {
                playerList.add(mapResultSetToEntity(resultSet));
            }
            return playerList;
        }
    }

    @Override
    public ArrayList<String> getSeasonMaxPlayerSalary() throws SQLException {
        String sql = "SELECT EXTRACT(YEAR FROM C.start) AS season , P.player_name , C.salary  FROM player P\n" +
                "JOIN contract C\n" +
                "ON P.contract_id = C.id\n" +
                "WHERE C.salary IN (SELECT max(C.salary) FROM player P\n" +
                "                   JOIN contract C\n" +
                "                   ON P.contract_id = C.id\n" +
                "                   GROUP BY EXTRACT(YEAR FROM C.start));";

        ArrayList<String> listOfPlayer = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql)){
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                String season = resultSet.getString(1);
                String name = resultSet.getString(2);
                BigDecimal salary = resultSet.getBigDecimal(3);


                listOfPlayer.add(season + " " + name + " " + salary.toString());
            }
            return listOfPlayer;
        }
    }
}
