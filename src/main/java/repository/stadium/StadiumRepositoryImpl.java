package repository.stadium;

import base.repository.BaseRepository;
import base.repository.BaseRepositoryImpl;
import model.Stadium;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StadiumRepositoryImpl extends BaseRepositoryImpl<Integer, Stadium>
        implements StadiumRepository {
    public StadiumRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return "stadium";
    }

    @Override
    public String getFieldName() {
        return "(stadium_name , city_id)";
    }

    @Override
    public String getQuestionMarks() {
        return "(?,?)";
    }

    @Override
    public String getUpdateFields() {
        return "stadium_name=? , city_id=?";
    }

    @Override
    public void setFields(PreparedStatement ps, Stadium entity, boolean isCountOnly) throws SQLException {
        ps.setString(1, entity.getStadiumName());
        ps.setInt(2,entity.getCityId());
    }

    @Override
    public Stadium mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt(1);
        String stadiumName = resultSet.getString(2);
        int cityId = resultSet.getInt(3);
        return new Stadium(id,stadiumName,cityId);
    }
}
