package com.example.tourism.business.services;

import com.example.tourism.data.entities.TripEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class TripService implements CrudService<TripEntity, Integer> {
    /**
     * @param entity
     * @return
     */
    @Override
    public TripEntity create(TripEntity entity) {
        return null;
    }

    /**
     * @param integer
     * @return
     */
    @Override
    public Optional<TripEntity> readById(Integer integer) {
        return Optional.empty();
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<TripEntity> readAll(Pageable pageable) {
        return null;
    }

    /**
     * @param newEntity
     */
    @Override
    public void update(TripEntity newEntity) {

    }

    /**
     * @param integer
     */
    @Override
    public void delete(Integer integer) {

    }
}
