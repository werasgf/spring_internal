package com.senlainc.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user")
    private User user;

    @Column(name = "comment")
    private String comment;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "comments")
    private Set<Comments> comments;

    @ManyToMany
    @JoinTable(name = "comments_reviews",
            joinColumns = @JoinColumn(name = "commetns_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "review-id", referencedColumnName = "id")
    )

    private Set<Reviews> reviews;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setComments(Set<Comments> comments) {
        this.comments = comments;
    }

    public Set<Comments> getComments() {
        return comments;
    }

    public void setReviews(Set<Reviews> reviews) {
        this.reviews = reviews;
    }

    public Set<Reviews> getReviews() {
        return reviews;
    }
}
