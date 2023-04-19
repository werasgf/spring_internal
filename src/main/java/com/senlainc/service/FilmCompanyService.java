package com.senlainc.service;

import com.senlainc.model.FilmCompany;

public interface FilmCompanyService {
    void save(FilmCompany filmCompany);
    void update(FilmCompany filmCompany, int id);
    FilmCompany getFilmCompanyById(int id);
    void delete(int id);
}
