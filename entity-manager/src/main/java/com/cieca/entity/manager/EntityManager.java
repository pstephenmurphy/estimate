package com.cieca.entity.manager;

import javax.annotation.Nonnull;

import com.cieca.entity.Entity;
import com.cieca.entity.manager.exceptions.EntityManagerException;

public interface EntityManager<T extends Entity<K>, K> {

    public void add(@Nonnull T managed) throws EntityManagerException, IllegalArgumentException;

    public void update(@Nonnull T managed) throws EntityManagerException, IllegalArgumentException;

    public void delete(@Nonnull K id) throws EntityManagerException, IllegalArgumentException;

    public T get(@Nonnull K id) throws EntityManagerException, IllegalArgumentException;
}
