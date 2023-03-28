package org.example.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "film_company")
public class FilmCompany {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "company_name")
    private String companyName;

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
}
