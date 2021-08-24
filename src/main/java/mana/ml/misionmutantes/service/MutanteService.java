package mana.ml.misionmutantes.service;

import mana.ml.misionmutantes.model.Mutante;
import mana.ml.misionmutantes.repository.HistoricoRepository;
import mana.ml.misionmutantes.repository.MutanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MutanteService implements HistoricoRepository {

    @Autowired
    private MutanteRepository mutanteRepository;

    @Override
    public List<Mutante> findAll() {
        return mutanteRepository.findAll();
    }

    @Override
    public List<Mutante> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Mutante> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Mutante> findAllById(Iterable<Long> longs) {
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
    public void delete(Mutante entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Mutante> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Mutante> S save(S entity) {
        return mutanteRepository.save(entity);
    }

    @Override
    public <S extends Mutante> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Mutante> findById(Long aLong) {
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
    public <S extends Mutante> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Mutante> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Mutante> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Mutante getOne(Long aLong) {
        return null;
    }

    @Override
    public Mutante getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Mutante> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Mutante> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Mutante> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Mutante> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Mutante> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Mutante> boolean exists(Example<S> example) {
        return false;
    }
}
