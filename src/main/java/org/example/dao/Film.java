package org.example.dao;

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
    private String genre;

    @Column(name = "watched")
    private boolean watched;

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

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public boolean isWatched() {
        return watched;
    }

    @Override
    public String toString() {
        return "Film [id=" + id + ", title=" + title + ", year=" + year + ", genre=" + genre + ", watched=" + watched + "]";
    }
}
