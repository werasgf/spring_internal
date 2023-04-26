package com.senlainc.repository;

import com.senlainc.model.FilmCompany;

public interface FilmCompanyRepository {
    public void save(FilmCompany filmCompany);
    public void update(FilmCompany filmCompany, int id);

    public FilmCompany findById(int id);

    public void delete(int id);
}
