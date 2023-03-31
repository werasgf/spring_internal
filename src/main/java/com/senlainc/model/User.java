package com.senlainc.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @Entity - указывает на то, что этот класс является сущность
 * @Table - указывает на конкретную таблицу для отображения этой сущности
 * @Id - указывает, что это поле является первичным ключом
 * @Column - связывает поле со столбцом в таблице
 * @GeneratedValue - свойство будет генерироваться автоматом
 */

@Entity
@Embeddable
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false, unique = true, length = 50)
    private String name;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @ManyToMany
    @JoinTable(name = "users_comments",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "comment_id", referencedColumnName = "id")
    )
    private Set<Comments> comments;

    @ManyToMany
    @JoinTable(name = "users_subscription",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "subscription_id", referencedColumnName = "id")
    )
    private Set<Subscription> subscriptions;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

    public void setComments(Set<Comments> comments) {
        this.comments = comments;
    }

    public Set<Comments> getComments() {
        return comments;
    }

    public void setSubscriptions(Set<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Set<Subscription> getSubscriptions() {
        return subscriptions;
    }
}