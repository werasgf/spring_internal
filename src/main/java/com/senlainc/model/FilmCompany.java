package com.senlainc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "film_company")
@NoArgsConstructor
public class FilmCompany {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "company_name")
    private String companyName;

    @Getter
    @Setter
    @OneToMany(mappedBy = "filmCompany")
    private List<Film> films;

    public FilmCompany(String companyName) {
        this.companyName = companyName;
    }
}