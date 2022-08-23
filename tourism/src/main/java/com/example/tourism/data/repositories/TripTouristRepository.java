package com.example.tourism.data.repositories;

import com.example.tourism.data.entities.TripTouristEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class TripTouristRepository implements JpaRepository<TripTouristEntity, Integer> {
    @Override
    public List<TripTouristEntity> findAll() {
        return null;
    }

    @Override
    public List<TripTouristEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TripTouristEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TripTouristEntity> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(TripTouristEntity tripTouristEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends TripTouristEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends TripTouristEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends TripTouristEntity> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<TripTouristEntity> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends TripTouristEntity> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<TripTouristEntity> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TripTouristEntity getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends TripTouristEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TripTouristEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TripTouristEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TripTouristEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TripTouristEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TripTouristEntity> boolean exists(Example<S> example) {
        return false;
    }
}
