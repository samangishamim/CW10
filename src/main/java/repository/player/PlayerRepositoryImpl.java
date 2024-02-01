package repository.player;

import base.repository.BaseRepositoryImpl;
import model.Player;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerRepositoryImpl extends BaseRepositoryImpl <Integer , Player>
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
        return "(player_name , salary , team_id)";
    }

    @Override
    public String getQuestionMarks() {
        return "(?,?,?)";
    }

    @Override
    public String getUpdateFields() {
        return "player_name = ? , salary = ? , team_id = ? ";
    }

    @Override
    public void setFields(PreparedStatement ps, Player entity, boolean isCountOnly) throws SQLException {
        ps.setString(1,entity.getPlayerName());
        ps.setBigDecimal(2,entity.getSalary());
        ps.setInt(3,entity.getTeamId());
    }

    @Override
    public Player mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        String playerName = resultSet.getString(2);
        BigDecimal salary = resultSet.getBigDecimal(3);
        int team_id = resultSet.getInt(4);
        return new Player(id,playerName,salary,team_id);
    }
}
