package com.senlainc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reviews")
public class Reviews {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "rating")
    private int rating;

//    @Getter
//    @Setter
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "comment", referencedColumnName = "id")
//    private Comments comment;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(
            name = "reviews_films",
            joinColumns = @JoinColumn(name = "review_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "film_id", referencedColumnName = "id")
    )
    private List<Film> films;

    public Reviews(int rating) {
        this.rating = rating;
    }
}
