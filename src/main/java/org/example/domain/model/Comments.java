package org.example.domain.model;

import javax.persistence.*;

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
}
