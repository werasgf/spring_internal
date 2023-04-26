package com.senlainc.service;

import com.senlainc.model.Genre;

public interface GenreService {
    void save(Genre genre);
    void update(Genre genre, int id);
    Genre getGenreById(int id);
    void delete(int id);
}
