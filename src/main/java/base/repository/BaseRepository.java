package base.repository;

import base.model.BaseEntity;

import java.io.Serializable;

public interface BaseRepository<ID extends Serializable, T extends BaseEntity<ID>> {
    void save(T entity);

    T findById(ID id);

    void update(T entity);

    void delete(ID id);
}
