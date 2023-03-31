package com.senlainc.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @Entity - указывает на то, что этот класс является сущность
 * @Table - указывает на конкретную таблицу для отображения этой сущности
 * @Id - указывает, что это поле является первичным ключом
 * @Column - связывает поле со столбцом в таблице
 * @GeneratedValue - свойство будет генерироваться автоматом
 * @FetchType.EAGER - стратегия, которая предусматривает получение полной связи между
 * сущностями, и последующих обращеня к связям не будет выполняться запрос на
 * получение данных, т.к. данные изначально будут получены полностью
 */

@Entity
@Table(name = "films")
public class Film {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "genre")
    private Genre genre;

    @Column(name = "film_company")
    private FilmCompany filmCompany;

    @Column(name = "actor")
    private Actor actor;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "films")
    private Set<Actor> actors;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "films")
    private Set<FilmCompany> filmCompanies;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "films")
    private Set<Genre> genres;

    @ManyToMany
    @JoinTable(name = "films_reviews",
            joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "review_id", referencedColumnName = "id")
    )

    private Set<Reviews> reviews;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Film [id=" + id + ", title=" + title + ", year=" + year + ", genre=" + genre + ", film company=" + filmCompany + ", actor=" + actor + "]";
    }

    public void setFilmCompany(FilmCompany filmCompany) {
        this.filmCompany = filmCompany;
    }

    public FilmCompany getFilmCompany() {
        return filmCompany;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setFilmCompanies(Set<FilmCompany> filmCompanies) {
        this.filmCompanies = filmCompanies;
    }

    public Set<FilmCompany> getFilmCompanies() {
        return filmCompanies;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setReviews(Set<Reviews> reviews) {
        this.reviews = reviews;
    }

    public Set<Reviews> getReviews() {
        return reviews;
    }
}
