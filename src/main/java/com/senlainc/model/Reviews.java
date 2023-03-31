package com.senlainc.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "reviews")
public class Reviews {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "film")
    private Film film;

    @Column(name = "rating")
    private int rating;

    @Column(name = "comment")
    private Comments comment;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "films")
    private Set<Film> films;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "comments")
    private Set<Comments> comments;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setComment(Comments comment) {
        this.comment = comment;
    }

    public Comments getComment() {
        return comment;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setComments(Set<Comments> comments) {
        this.comments = comments;
    }

    public Set<Comments> getComments() {
        return comments;
    }
}
