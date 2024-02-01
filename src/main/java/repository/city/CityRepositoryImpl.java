package repository.city;

import base.repository.BaseRepositoryImpl;
import model.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityRepositoryImpl extends BaseRepositoryImpl <Integer, City> implements CityRepository {
    public CityRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return "city";
    }

    @Override
    public String getFieldName() {
        return "(city_name)";
    }

    @Override
    public String getQuestionMarks() {
        return "(?)";
    }


    @Override
    public String getUpdateFields() {
        return "city_name=?";
    }

    @Override
    public void setFields(PreparedStatement ps, City entity, boolean isCountOnly) throws SQLException {
        ps.setString(1,entity.getCityName());
    }

    @Override
    public City mapResultSetToEntity(ResultSet resultSet) throws SQLException {
        String cityName = resultSet.getString(1);
        return new City(cityName);
    }
}
