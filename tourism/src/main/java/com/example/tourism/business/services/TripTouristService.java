package com.example.tourism.business.services;

import com.example.tourism.data.entities.TripTouristEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class TripTouristService implements CrudService<TripTouristEntity, Integer> {
    /**
     * @param entity
     * @return
     */
    @Override
    public TripTouristEntity create(TripTouristEntity entity) {
        return null;
    }

    /**
     * @param integer
     * @return
     */
    @Override
    public Optional<TripTouristEntity> readById(Integer integer) {
        return Optional.empty();
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<TripTouristEntity> readAll(Pageable pageable) {
        return null;
    }

    /**
     * @param newEntity
     */
    @Override
    public void update(TripTouristEntity newEntity) {

    }

    /**
     * @param integer
     */
    @Override
    public void delete(Integer integer) {

    }
}
