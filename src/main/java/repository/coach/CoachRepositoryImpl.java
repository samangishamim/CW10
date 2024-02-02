package repository.coach;

import base.repository.BaseRepositoryImpl;
import model.Coach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CoachRepositoryImpl extends BaseRepositoryImpl<Integer , Coach> implements CoachRepository {
    public CoachRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return "coach";
    }

    @Override
    public String getFieldName() {
        return "(coach_name , team_id , contract_id)";
    }

    @Override
    public String getQuestionMarks() {
        return "(?,?,?)";
    }

    @Override
    public String getUpdateFields() {
        return "coach_name = ? , team_id = ? , contract_id = ?";
    }

    @Override
    public void setFields(PreparedStatement ps, Coach entity, boolean isCountOnly) throws SQLException {
        ps.setString(1,entity.getCoachName());
        ps.setInt(2,entity.getTeamId());
        ps.setInt(3,entity.getContractId());
    }

    @Override
    public Coach mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        String coachName = resultSet.getString(2);
        int teamId = resultSet.getInt(3);
        int contractId = resultSet.getInt(4);

        return new Coach(id , coachName , teamId , contractId);
    }
}
