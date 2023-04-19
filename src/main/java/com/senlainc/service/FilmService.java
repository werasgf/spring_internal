package com.senlainc.service;

import com.senlainc.model.Film;

public interface FilmService {
    void save(Film film);

    void update(Film film, int id);

    Film getFilmById(int id);

    void delete(int id);
}
