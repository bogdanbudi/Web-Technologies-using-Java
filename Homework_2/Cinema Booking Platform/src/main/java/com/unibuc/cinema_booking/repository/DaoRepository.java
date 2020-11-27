package com.unibuc.cinema_booking.repository;

import java.util.List;

public interface DaoRepository<T> {

    T save(T object);
    boolean delete(T object);
    T getOne(Long id);
    List<T> getAll();
}
