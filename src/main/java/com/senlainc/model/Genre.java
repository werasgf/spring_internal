package com.senlainc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genres")
public class Genre {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "genre")
    private String genre;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(
            name = "genres_films",
            joinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "film_id", referencedColumnName = "id")
    )
    private List<Film> films;

    public Genre(String genre) {
        this.genre = genre;
    }
}
