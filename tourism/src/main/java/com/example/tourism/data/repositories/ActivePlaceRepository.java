package com.example.tourism.data.repositories;

import com.example.tourism.data.entities.ActivePlaceEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class ActivePlaceRepository implements JpaRepository<ActivePlaceEntity, Integer> {
    @Override
    public List<ActivePlaceEntity> findAll() {
        return null;
    }

    @Override
    public List<ActivePlaceEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<ActivePlaceEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<ActivePlaceEntity> findAllById(Iterable<Integer> iterable) {
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
    public void delete(ActivePlaceEntity activePlaceEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends ActivePlaceEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends ActivePlaceEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends ActivePlaceEntity> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<ActivePlaceEntity> findById(Integer integer) {
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
    public <S extends ActivePlaceEntity> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<ActivePlaceEntity> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ActivePlaceEntity getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends ActivePlaceEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ActivePlaceEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ActivePlaceEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ActivePlaceEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ActivePlaceEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ActivePlaceEntity> boolean exists(Example<S> example) {
        return false;
    }
}
