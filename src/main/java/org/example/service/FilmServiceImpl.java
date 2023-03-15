package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {

    @Override
    public String sayFilmName() {
        return "Film";
    }
}
