package com.example.tourism.business.services;

import com.example.tourism.data.entities.ActivePlaceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ActivePlaceService implements CrudService<ActivePlaceEntity, Integer> {
    /**
     * @param entity
     * @return
     */
    @Override
    public ActivePlaceEntity create(ActivePlaceEntity entity) {
        return null;
    }

    /**
     * @param integer
     * @return
     */
    @Override
    public Optional<ActivePlaceEntity> readById(Integer integer) {
        return Optional.empty();
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<ActivePlaceEntity> readAll(Pageable pageable) {
        return null;
    }

    /**
     * @param newEntity
     */
    @Override
    public void update(ActivePlaceEntity newEntity) {

    }

    /**
     * @param integer
     */
    @Override
    public void delete(Integer integer) {

    }
}
