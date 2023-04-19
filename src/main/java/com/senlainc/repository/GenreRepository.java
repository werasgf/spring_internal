package com.senlainc.repository;

import com.senlainc.model.Genre;

public interface GenreRepository {
    public void save(Genre genre);
    public void update(Genre genre, int id);

    public Genre findById(int id);

    public void delete(int id);
}
