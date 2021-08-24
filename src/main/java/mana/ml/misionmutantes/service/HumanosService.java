package mana.ml.misionmutantes.service;

import mana.ml.misionmutantes.model.Humanos;
import mana.ml.misionmutantes.repository.HumanosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HumanosService implements HumanosRepository {

    @Autowired
    private HumanosRepository humanosRepository;

    @Override
    public List<Humanos> findAll() {
        return humanosRepository.findAll();
    }

    @Override
    public List<Humanos> findAll(Sort sort) {
        return humanosRepository.findAll(sort);
    }

    @Override
    public Page<Humanos> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Humanos> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Humanos entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Humanos> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Humanos> S save(S entity) {
        return humanosRepository.save(entity);
    }

    @Override
    public <S extends Humanos> List<S> saveAll(Iterable<S> entities) {
        return humanosRepository.saveAll(entities);
    }

    @Override
    public Optional<Humanos> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Humanos> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Humanos> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Humanos> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Humanos getOne(Long aLong) {
        return null;
    }

    @Override
    public Humanos getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Humanos> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Humanos> List<S> findAll(Example<S> example) {
        return humanosRepository.findAll(example);
    }

    @Override
    public <S extends Humanos> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Humanos> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Humanos> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Humanos> boolean exists(Example<S> example) {
        return false;
    }

}
