package repository;

import domain.Entity;

import java.util.Optional;

public interface Repository<ID, E extends Entity<ID>> {
    Optional<E> findById(ID id);

    Iterable<E> findAll();

    E save(E entity);

    E update(E entity);

    void delete(E entity);
}
