package com.example.tourism.data.repositories;

import com.example.tourism.data.entities.PlaceEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class PlaceRepository implements JpaRepository<PlaceEntity, Integer> {
    @Override
    public List<PlaceEntity> findAll() {
        return null;
    }

    @Override
    public List<PlaceEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PlaceEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PlaceEntity> findAllById(Iterable<Integer> iterable) {
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
    public void delete(PlaceEntity placeEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends PlaceEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PlaceEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends PlaceEntity> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<PlaceEntity> findById(Integer integer) {
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
    public <S extends PlaceEntity> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<PlaceEntity> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PlaceEntity getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends PlaceEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PlaceEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PlaceEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PlaceEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PlaceEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PlaceEntity> boolean exists(Example<S> example) {
        return false;
    }
}
