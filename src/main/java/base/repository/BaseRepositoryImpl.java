package base.repository;

import base.model.BaseEntity;

import java.io.Serializable;

public class BaseRepositoryImpl <ID extends Serializable,T extends BaseEntity<ID>> implements BaseRepository<ID,T>{
    @Override
    public void save(T entity) {

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
}
