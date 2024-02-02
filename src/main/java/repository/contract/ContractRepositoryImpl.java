package repository.contract;

import base.repository.BaseRepositoryImpl;
import model.Contract;

import java.math.BigDecimal;
import java.sql.*;

public class ContractRepositoryImpl extends BaseRepositoryImpl<Integer , Contract>
        implements ContractRepository {
    public ContractRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return "contract";
    }

    @Override
    public String getFieldName() {
        return "(start , finish , salary)";
    }

    @Override
    public String getQuestionMarks() {
        return "(?,?,?)";
    }

    @Override
    public String getUpdateFields() {
        return "start = ? , finish = ? , salary = ?";
    }

    @Override
    public void setFields(PreparedStatement ps, Contract entity, boolean isCountOnly) throws SQLException {
        ps.setDate(1,entity.getStart());
        ps.setDate(2,entity.getFinish());
        ps.setBigDecimal(3,entity.getSalary());
    }

    @Override
    public Contract mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        Date start = resultSet.getDate(2);
        Date finish = resultSet.getDate(3);
        BigDecimal salary = resultSet.getBigDecimal(4);

        return new Contract(id , start , finish , salary);
    }
}
