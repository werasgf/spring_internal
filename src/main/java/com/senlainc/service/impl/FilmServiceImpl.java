package com.senlainc.service.impl;

import com.senlainc.model.Film;
import com.senlainc.repository.FilmRepository;
import com.senlainc.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmRepository filmRepository;

    @Override
    public void save(Film film) {
        filmRepository.save(film);
    }


    @Override
    public void update(Film film, int id) {
        filmRepository.update(film, id);
    }

    @Override
    public Film getFilmById(int id) {
        return filmRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        filmRepository.delete(id);
    }
}
