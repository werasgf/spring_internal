package org.example.domain.service;

import org.example.domain.service.FilmService;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {

    @Override
    public String sayFilmName() {
        return "Film";
    }
}
