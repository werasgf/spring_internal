package com.senlainc.model;

import javax.persistence.*;
import java.util.Set;

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

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "users")
    private Set<User> users;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "users")
    private Set<User> friends;

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

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setFriends(Set<User> friends) {
        this.friends = friends;
    }

    public Set<User> getFriends() {
        return friends;
    }
}
