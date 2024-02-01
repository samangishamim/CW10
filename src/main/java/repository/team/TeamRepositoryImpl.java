package repository.team;

import base.repository.BaseRepositoryImpl;
import base.service.BaseServiceImpl;
import model.Team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeamRepositoryImpl extends BaseRepositoryImpl<Integer, Team>
        implements TeamRepository {

    public TeamRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return "team";
    }
    @Override
    public String getFieldName() {
        return "(team_name , city_id)";
    }

    @Override
    public String getQuestionMarks() {
        return "(?, ?)";
    }

    @Override
    public String getUpdateFields() {
        // todo UPDATE team SET team_name = ? , city_id = ?     WHERE id = ?
        return "team_name = ? , city_id = ?";
    }

    @Override
    public void setFields(PreparedStatement ps, Team entity, boolean isCountOnly) throws SQLException {
        ps.setString(1,entity.getTeamName());
        ps.setInt(2,entity.getCityId());
    }

    @Override
    public Team mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        String teamName = resultSet.getString(2);
        int cityId = resultSet.getInt(3);

        return new Team(id , teamName , cityId);
    }
}
