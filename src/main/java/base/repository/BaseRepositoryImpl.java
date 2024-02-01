package base.repository;

import base.model.BaseEntity;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
            setFields(ps);
            ps.executeUpdate();
        }

    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public void update(T entity) {

    }

    @Override
    public void delete(ID id) {

    }

    public abstract String getTableName();

    public abstract String getQuestionMarks();

    public abstract String getFieldName();

    public abstract String setFields(PreparedStatement ps);

}
