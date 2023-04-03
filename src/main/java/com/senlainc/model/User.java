package com.senlainc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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
@Getter @Setter
@AllArgsConstructor
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


}