package com.example.tourism.business.impls;

import com.example.tourism.business.services.ActivePlaceService;
import com.example.tourism.data.entities.ActivePlaceEntity;
import com.example.tourism.data.repositories.ActivePlaceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ActivePlaceServiceImpl extends ActivePlaceService {
    ActivePlaceRepository activePlaceRepository;

    public ActivePlaceServiceImpl(ActivePlaceRepository activePlaceRepository) {
        this.activePlaceRepository = activePlaceRepository;
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public ActivePlaceEntity create(ActivePlaceEntity entity) {
        return super.create(entity);
    }

    /**
     * @param integer
     * @return
     */
    @Override
    public Optional<ActivePlaceEntity> readById(Integer integer) {
        return super.readById(integer);
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<ActivePlaceEntity> readAll(Pageable pageable) {
        return super.readAll(pageable);
    }

    /**
     * @param newEntity
     */
    @Override
    public void update(ActivePlaceEntity newEntity) {
        super.update(newEntity);
    }

    /**
     * @param integer
     */
    @Override
    public void delete(Integer integer) {
        super.delete(integer);
    }
}
