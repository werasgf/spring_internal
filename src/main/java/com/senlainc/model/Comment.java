package com.senlainc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comments")
@NoArgsConstructor
public class Comment {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "users")
    private User user;

    @Getter
    @Setter
    @Column(name = "text")
    private String text;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "review")
    private Review review;

    public Comment( String text) {
//        this.user = user;
        this.text = text;
    }
}
