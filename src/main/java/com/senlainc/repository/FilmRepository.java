package com.senlainc.repository;

import com.senlainc.model.Film;

public interface FilmRepository {
    public void save(Film film);
    public void update(Film film, int id);

    public Film findById(int id);

    public void delete(int id);
}
