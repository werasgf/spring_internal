package org.example.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Reviews {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "rating")
    private int rating;

    @Column(name = "user")
    private User user;

    @Column(name = "comment")
    private Comments comments;

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

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Comments getComments() {
        return comments;
    }
}
