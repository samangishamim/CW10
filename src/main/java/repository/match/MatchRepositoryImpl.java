package repository.match;

import base.repository.BaseRepositoryImpl;
import model.Match;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MatchRepositoryImpl extends BaseRepositoryImpl<Integer, Match> implements MatchRepository{
    public MatchRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return "match";
    }

    @Override
    public String getFieldName() {
        return "(number_of_goals,score,team_id,stadium_id)";
    }

    @Override
    public String getQuestionMarks() {
        return "(?,?,?,?)";
    }

    @Override
    public String getUpdateFields() {
        return "number_of_goals=?,score =?,team_id= ?,stadium_id =?";
    }

    @Override
    public void setFields(PreparedStatement ps, Match entity, boolean isCountOnly) throws SQLException {
        ps.setInt(1,entity.getNumberOfGoals());
        ps.setInt(2,entity.getScore());
        ps.setInt(3,entity.getTeamId());
        ps.setInt(4,entity.getStadiumId());

    }

    @Override
    public Match mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        int numberOfGoals = resultSet.getInt(2);
        int score = resultSet.getInt(3);
        int teamId = resultSet.getInt(4);
        int stadiumId = resultSet.getInt(5);

        return new Match(id,numberOfGoals,score,teamId,stadiumId);
    }
}
