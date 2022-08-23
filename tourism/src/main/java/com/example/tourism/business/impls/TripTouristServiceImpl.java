package com.example.tourism.business.impls;

import com.example.tourism.business.services.TripTouristService;
import com.example.tourism.data.entities.TripTouristEntity;
import com.example.tourism.data.repositories.TripTouristRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class TripTouristServiceImpl extends TripTouristService {

    TripTouristRepository tripTouristRepository;

    public TripTouristServiceImpl(TripTouristRepository tripTouristRepository) {
        this.tripTouristRepository = tripTouristRepository;
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public TripTouristEntity create(TripTouristEntity entity) {
        return super.create(entity);
    }

    /**
     * @param integer
     * @return
     */
    @Override
    public Optional<TripTouristEntity> readById(Integer integer) {
        return super.readById(integer);
    }

    /**
     * @param pageable
     * @return
     */
    @Override
    public Page<TripTouristEntity> readAll(Pageable pageable) {
        return super.readAll(pageable);
    }

    /**
     * @param newEntity
     */
    @Override
    public void update(TripTouristEntity newEntity) {
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
