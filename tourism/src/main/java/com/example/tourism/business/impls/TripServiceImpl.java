package com.example.tourism.business.impls;

import com.example.tourism.business.services.TripService;
import com.example.tourism.data.entities.TripEntity;
import com.example.tourism.data.repositories.TripRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class TripServiceImpl extends TripService {

    TripRepository  tripRepository;

    public TripServiceImpl(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public TripEntity create(TripEntity entity) {
        return super.create(entity);
    }

    /**
     * @param integer
     * @return
     */
    @Override
    public Optional<TripEntity> readById(Integer integer) {
        return super.readById(integer);
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<TripEntity> readAll(Pageable pageable) {
        return super.readAll(pageable);
    }

    /**
     * @param newEntity
     */
    @Override
    public void update(TripEntity newEntity) {
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
