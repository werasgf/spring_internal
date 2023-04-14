package com.senlainc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user", referencedColumnName = "id")
    private User user;

    @Getter
    @Setter
    @Column(name = "text")
    private String text;

    public Comment( String text) {
//        this.user = user;
        this.text = text;
    }
}
