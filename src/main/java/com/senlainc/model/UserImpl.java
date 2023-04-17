package com.senlainc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class UserImpl implements User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    @Setter
    @Column(name = "name", nullable = false, unique = true, length = 50)
    private String name;

    @Getter
    @Setter
    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @OneToMany(mappedBy = "user")
    private List<CommentsImpl> comments;

    public UserImpl(String name, String email) {
        this.name = name;
        this.email = email;
    }
}