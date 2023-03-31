package com.senlainc.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "film_company")
public class FilmCompany {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company_name")
    private String companyName;

    @ManyToMany
    @JoinTable(name = "film_company_films",
            joinColumns = @JoinColumn(name = "film_company_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "film_id", referencedColumnName = "id")
    )

    private Set<Film> films;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    public Set<Film> getFilms() {
        return films;
    }
}
