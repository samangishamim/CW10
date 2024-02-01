package base.repository;

import base.model.BaseEntity;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class BaseRepositoryImpl<ID extends Serializable, T extends BaseEntity<ID>>
        implements BaseRepository<ID, T> {
    public final Connection connection;

    protected BaseRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(T entity) throws SQLException {
        //todo : INSERT INTO tableName (fieldName) VALUES (QuestionMarks)
        String sql = "INSERT INTO " + getTableName() + getFieldName() + " VALUES " + getQuestionMarks();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            setFields(ps, entity, false);
            ps.executeUpdate();
        }

    }

    @Override
    public T findById(ID id) throws SQLException {
        // todo : SELECT * FROM tableName where id=?;
        String sql = "SELECT * FROM" + getTableName() + " WHERE id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, (Integer) id);

            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                return mapResultSetToEntity(resultSet);
            }
        }
        return null;
    }

    @Override
    public void update(T entity) throws SQLException {
        // todo : UPDATE TableName SET fieldName=? , . . . WHERE id=?;
        String sql = "UPDATE " + getTableName() + " SET " + getUpdateFields() + " WHERE id = " + entity.getId();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            setFields(ps, entity, true);

            ps.executeUpdate();
        }
    }

    @Override
    public void delete(ID id) throws SQLException {
        //todo : DELETE FROM TableName WHERE id=?
        String sql = "DELETE FROM " + getTableName() + "WHERE id=" + id;
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.executeUpdate();
        }

    }

    public abstract String getTableName();

    public abstract String getQuestionMarks();

    public abstract String getFieldName();

    public abstract String getUpdateFields();

    public abstract void setFields(PreparedStatement ps, T entity, boolean isCountOnly) throws SQLException;

    public abstract T mapResultSetToEntity(ResultSet resultSet) throws SQLException;

}
