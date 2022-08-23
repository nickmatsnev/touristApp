package com.example.tourism.business.impls;

import com.example.tourism.business.services.PlaceService;
import com.example.tourism.data.entities.PlaceEntity;
import com.example.tourism.data.repositories.PlaceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class PlaceServiceImpl extends PlaceService {

    PlaceRepository placeRepository;

    public PlaceServiceImpl(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public PlaceEntity create(PlaceEntity entity) {
        return super.create(entity);
    }

    /**
     * @param integer
     * @return
     */
    @Override
    public Optional<PlaceEntity> readById(Integer integer) {
        return super.readById(integer);
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<PlaceEntity> readAll(Pageable pageable) {
        return super.readAll(pageable);
    }

    /**
     * @param newEntity
     */
    @Override
    public void update(PlaceEntity newEntity) {
        super.update(newEntity);
    }

    /**
     * @param integer
     */
    @Override
    public void delete(Integer integer) {
        super.delete(integer);
    }

    /**
     * @return
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
