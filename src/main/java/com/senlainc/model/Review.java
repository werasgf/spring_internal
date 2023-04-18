package com.senlainc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "rating")
    private int rating;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "comment")
    private Comment comment;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(
            name = "reviews_films",
            joinColumns = @JoinColumn(name = "review_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    private List<Film> films;

    public Review(int rating) {
        this.rating = rating;
    }
}
