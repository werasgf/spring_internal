package com.senlainc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "films")
@NoArgsConstructor
public class Film {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Getter
    @Setter
    @Column(name = "year")
    private int year;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "films")
    private List<Actor> actors;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "film_company")
    private FilmCompany filmCompany;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "films")
    private List<Genre> genres;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "films")
    private List<Review> reviews;

    public Film(String title, int year) {
        this.title = title;
        this.year = year;
    }
}
