package org.example.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user")
    private User user;

    @Column(name = "friend")
    private User friend;

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

    public void setFriend(User friend) {
        this.friend = friend;
    }

    public User getFriend() {
        return friend;
    }
}
