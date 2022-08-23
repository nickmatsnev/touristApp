package com.example.tourism.data.repositories;

import com.example.tourism.data.entities.TripEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class TripRepository implements JpaRepository<TripEntity, Integer> {
    @Override
    public List<TripEntity> findAll() {
        return null;
    }

    @Override
    public List<TripEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TripEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TripEntity> findAllById(Iterable<Integer> iterable) {
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
    public void delete(TripEntity tripEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends TripEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends TripEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends TripEntity> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<TripEntity> findById(Integer integer) {
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
    public <S extends TripEntity> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<TripEntity> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TripEntity getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends TripEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TripEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TripEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TripEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TripEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TripEntity> boolean exists(Example<S> example) {
        return false;
    }
}
