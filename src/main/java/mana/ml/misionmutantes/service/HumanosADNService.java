package mana.ml.misionmutantes.service;

import mana.ml.misionmutantes.model.HumanosADN;
import mana.ml.misionmutantes.repository.HumanosADNRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HumanosADNService implements HumanosADNRepository {

    @Autowired
    private HumanosADNRepository humanosADNRepository;

    @Override
    public <S extends HumanosADN> S save(S entity) {
        return humanosADNRepository.save(entity);
    }

    @Override
    public List<HumanosADN> findAll() {
        return humanosADNRepository.findAll();
    }

    @Override
    public List<HumanosADN> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<HumanosADN> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<HumanosADN> findAllById(Iterable<Long> longs) {
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
    public void delete(HumanosADN entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends HumanosADN> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends HumanosADN> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<HumanosADN> findById(Long aLong) {
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
    public <S extends HumanosADN> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends HumanosADN> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<HumanosADN> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public HumanosADN getOne(Long aLong) {
        return null;
    }

    @Override
    public HumanosADN getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends HumanosADN> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends HumanosADN> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends HumanosADN> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends HumanosADN> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends HumanosADN> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends HumanosADN> boolean exists(Example<S> example) {
        return false;
    }
}
