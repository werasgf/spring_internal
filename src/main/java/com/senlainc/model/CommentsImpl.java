package com.senlainc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "comments_users")
public class CommentsImpl implements Comments{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserImpl user;

    @Getter
    @Setter
    @Column(name = "text", nullable = false, unique = true, length = 50)
    private String text;

    public CommentsImpl(UserImpl user, String text) {
        this.user = user;
        this.text = text;
    }
}
