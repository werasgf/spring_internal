package com.senlainc.service.impl;

import com.senlainc.model.Genre;
import com.senlainc.repository.GenreRepository;
import com.senlainc.repository.impl.GenreRepositoryImpl;
import com.senlainc.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {
    @Autowired
    private GenreRepository genreRepository = new GenreRepositoryImpl();

    @Override
    public void save(Genre genre) {
        genreRepository.save(genre);
    }

    @Override
    public void update(Genre genre, int id) {
        genreRepository.update(genre, id);
    }

    @Override
    public Genre getGenreById(int id) {
        return genreRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        genreRepository.delete(id);
    }
}
