package com.senlainc.service.impl;

import com.senlainc.service.FilmService;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {

    @Override
    public String sayFilmName() {
        return "Film";
    }
}
