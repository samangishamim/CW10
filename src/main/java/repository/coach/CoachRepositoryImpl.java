package repository.coach;

import base.repository.BaseRepositoryImpl;
import model.Coach;

import java.math.BigDecimal;
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

    @Override
    public String getCoachMaxSalary() throws SQLException {
        String query = "SELECT A.coach_name , B.salary FROM coach A\n" +
                "JOIN contract B\n" +
                "ON A.contract_id = B.id\n" +
                "WHERE B.salary = (SELECT max(salary) FROM coach A JOIN contract B\n" +
                "                  ON A.contract_id = B.id);";
        try (PreparedStatement ps = connection.prepareStatement(query) ){
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()){
                String name = resultSet.getString(1);
                BigDecimal salary = resultSet.getBigDecimal(2);
                String salaryStr = salary.toString();
                return name + " " + salaryStr;
            }
        }
        return null;
    }
}
