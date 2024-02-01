package repository;

import base.repository.BaseRepositoryImpl;
import model.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CityRepositoryImpl extends BaseRepositoryImpl <Integer, City> implements CityRepository {
    protected CityRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public String getQuestionMarks() {
        return null;
    }

    @Override
    public String getFieldName() {
        return null;
    }

    @Override
    public String getUpdateFields() {
        return null;
    }

    @Override
    public String setFields(PreparedStatement ps, City entity, boolean isCountOnly) {
        return null;
    }

    @Override
    public City mapResultSetToEntity(ResultSet resultSet) {
        return null;
    }
}
