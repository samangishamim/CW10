package base.service;

import base.model.BaseEntity;
import base.repository.BaseRepository;

import java.io.Serializable;

public class BaseServiceImpl <
        ID extends Serializable,
        T extends BaseEntity<ID>,
        R extends BaseRepository<ID,T>
        > implements BaseService<ID , T> {

    public  final R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

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
