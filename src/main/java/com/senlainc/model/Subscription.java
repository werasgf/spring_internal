package com.senlainc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @ManyToOne()
    @JoinColumn(name = "users")
    private User user;

    @Getter
    @Setter
    @ManyToOne()
    @JoinColumn(name = "friend")
    private User friend;
}
