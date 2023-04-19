package com.senlainc.service.impl;

import com.senlainc.model.FilmCompany;
import com.senlainc.repository.FilmCompanyRepository;
import com.senlainc.repository.impl.FilmCompanyRepositoryImpl;
import com.senlainc.service.FilmCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmCompanyServiceImpl implements FilmCompanyService {
    @Autowired
    private FilmCompanyRepository filmCompanyRepository = new FilmCompanyRepositoryImpl();

    @Override
    public void save(FilmCompany filmCompany) {
        filmCompanyRepository.save(filmCompany);
    }

    @Override
    public void update(FilmCompany filmCompany, int id) {
        filmCompanyRepository.update(filmCompany, id);
    }

    @Override
    public FilmCompany getFilmCompanyById(int id) {
        return filmCompanyRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        filmCompanyRepository.delete(id);
    }
}
