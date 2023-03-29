package org.example.domain.model;

import javax.persistence.*;

/**
 * @Entity - указывает на то, что этот класс является сущность
 * @Table - указывает на конкретную таблицу для отображения этой сущности
 * @Id - указывает, что это поле является первичным ключом
 * @Column - связывает поле со столбцом в таблице
 * @GeneratedValue - свойство будет генерироваться автоматом
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
}
