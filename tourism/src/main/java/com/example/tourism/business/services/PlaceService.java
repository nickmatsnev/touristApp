package com.example.tourism.business.services;

import com.example.tourism.data.entities.PlaceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class PlaceService implements CrudService<PlaceEntity, Integer> {
    /**
     * @param entity
     * @return
     */
    @Override
    public PlaceEntity create(PlaceEntity entity) {
        return null;
    }

    /**
     * @param integer
     * @return
     */
    @Override
    public Optional<PlaceEntity> readById(Integer integer) {
        return Optional.empty();
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<PlaceEntity> readAll(Pageable pageable) {
        return null;
    }

    /**
     * @param newEntity
     */
    @Override
    public void update(PlaceEntity newEntity) {

    }

    /**
     * @param integer
     */
    @Override
    public void delete(Integer integer) {

    }
}
